package com.car.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


@RequestMapping("file")  
@Controller  
public class FileController {  
    /**  
     * 文件上传功能  
     * @param file  
     * @return  
     * @throws IOException   
     */  
    @RequestMapping(value="/upload",method=RequestMethod.POST)  
    @ResponseBody  
    public String upload(MultipartFile file,HttpServletRequest request) throws IOException{  
        String path = request.getSession().getServletContext().getRealPath("images/basic");  
        String fileName = file.getOriginalFilename();  
        System.out.println("上传的文件名"+fileName);
        System.out.println("路径"+path);
        File dir = new File(path,fileName);          
        if(!dir.exists()){  
            dir.mkdirs();  
        }  
        //MultipartFile自带的解析方法  
        file.transferTo(dir);  
        return "fileUpload is ok!";  
    }  
    
    @RequestMapping("/download")
    public void down(HttpServletRequest request,HttpServletResponse response) throws Exception{  
    	System.out.println("开始下载文件");
        //模拟文件，myfile.txt为需要下载的文件  
        String fileName = request.getSession().getServletContext().getRealPath("file")+"/test.doc";  
        //获取输入流  
        InputStream bis = new BufferedInputStream(new FileInputStream(new File(fileName)));  
        //假如以中文名下载的话  
        String filename = "Car DisPlay.doc";  
        //转码，免得文件名中文乱码  
        filename = URLEncoder.encode(filename,"UTF-8");  
        //设置文件下载头  
        response.addHeader("Content-Disposition", "attachment;filename=" + filename);    
        //1.设置文件ContentType类型，这样设置，会自动判断下载文件类型    
        response.setContentType("multipart/form-data");   
        BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());  
        int len = 0;  
        while((len = bis.read()) != -1){  
            out.write(len);  
            out.flush();  
        }  
        out.close();  
    }  
      
} 


