package com.car.controller;

import java.io.File;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.car.converter.PassageConverter;
import com.car.form.PassageForm;
import com.car.po.Passage;
import com.car.service.PassageService;

@Controller
public class PassageController {

	@Autowired
	private PassageService passageService;
	
	private static final Log logger = LogFactory.getLog(BasicController.class);
	String dispatchURL = "";

	@RequestMapping("/toFilelist")
	public String toFilelist(Model model,PassageForm passageForm){
		List<Passage> passages = passageService.findAll();
		List<PassageForm> passageForms = PassageConverter.toPassageForms(passages);
		model.addAttribute("passageForms", passageForms);
		return "filelist";
	}
	//文章保存
			@RequestMapping("/savePassage")
			public String savePassage(Model model,PassageForm passageForm){
					Passage passage = new Passage();
					passage.setOpName(passageForm.getOpName());
					passage.setPsImg(passageForm.getPsImg());
					passage.setPsTitle(passageForm.getPsTitle());
					passage.setPsContent(passageForm.getPsContent());
					System.out.println("增加的passage:"+passage);
					passageService.add(passage);
					model.addAttribute("passageForm", passageForm);
					model.addAttribute("msg", "文章保存成功，快去查看吧！");
					return toFilelist(model, passageForm);
			}
			

			@RequestMapping(value="/imgUpload", method = { RequestMethod.POST })
			public String fileUpload(@RequestParam("file") MultipartFile file, HttpServletRequest request, ModelMap model,int psId,Passage passage){
				if ("post".equals(request.getMethod().toLowerCase())) {
			        String url = "";
			        try {
			            String staticPath = request.getSession().getServletContext().getRealPath("/images/basic");
			            String fileName = new Date().getTime() + ".jpg";
			            File targetFile = new File(staticPath, fileName);
			            file.transferTo(targetFile);
			            url = "http://localhost:" + request.getLocalPort() + request.getSession().getServletContext().getContextPath() + "/images/basic" + fileName;
			        } catch (Exception e) {
			            e.printStackTrace();
			        }
			        if (file.getSize() != 0) {
			            passage.setPsImg(url);
			        }
			        passageService.update(passage);
			        
			    }
				return "ok!";
			}
			
			//到文章录入页面
			@RequestMapping("/toForm")
			public String toForm(Model model){
				logger.info("加载到toForm");
				List<Passage> passages = passageService.findAll();
				List<PassageForm> passageForms = PassageConverter.toPassageForms(passages);
				model.addAttribute("passageForms", passageForms);
				return "form";
			}
			
			@RequestMapping("/toUpdate")
			public String toUpdate(Model model,int psId){
				logger.info("加载到toUpdate");
				Passage passage = passageService.findById(psId);
				System.out.println(passage);
				PassageForm passageForm = PassageConverter.toPassageForm(passage);
				System.out.println("转换后psform"+passageForm);
				model.addAttribute("passageForm", passageForm);
				return "psUpdate";
			}
			
			@RequestMapping("psUpdate")
			public String psUpdate(Model model,PassageForm passageForm){
				System.out.println("页面psId"+passageForm.getPsId());
				Passage passage = PassageConverter.toPassage(passageForm);
				System.out.println("转换后的passage"+passage);
				passageService.update(passage);
				List<Passage> passages = passageService.findAll();
				List<PassageForm> passageForms = PassageConverter.toPassageForms(passages);
				model.addAttribute("passageForms", passageForms);
				return "filelist";
			}
			
			@RequestMapping("/psDelete")
			public String psDelete(Model model,int psId){
				Passage passage = passageService.findById(psId);
				passageService.delete(passage);
				List<Passage> passages = passageService.findAll();
				List<PassageForm> passageForms = PassageConverter.toPassageForms(passages);
				model.addAttribute("passageForms", passageForms);
				return "filelist";
			}
			
			@RequestMapping("/toMaintain")
			public String toMaintain(Model model){
				String opName = "保养";
				List<Passage> passages = passageService.findOPpassage(opName);
				System.out.println(passages);
				model.addAttribute("passages", passages);
				return "maintain";
				
			}
			
			@RequestMapping("/toRepair")
			public String toRepair(Model model){
				String opName = "维修";
				List<Passage> passages = passageService.findOPpassage(opName);
				System.out.println(passages);
				model.addAttribute("passages", passages);
				return "repair";
			}
			
			@RequestMapping("/toPassage")
			public String toMpassage(Model model,int psId){
				Passage passage = passageService.findById(psId);
				model.addAttribute("passage", passage);
				return "passage";
			}
}
