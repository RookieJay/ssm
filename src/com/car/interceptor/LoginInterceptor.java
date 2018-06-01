package com.car.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.car.po.User;

public class LoginInterceptor implements HandlerInterceptor {
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		// TODO Auto-generated method stub
		String requestURI = request.getRequestURI();  
//        if(/*requestURI.indexOf("login")>0||*/requestURI.indexOf("home")>0||requestURI.indexOf("main")>0||requestURI.indexOf("maintain")>0||requestURI.indexOf("repair")>0||requestURI.indexOf("contact")>0||requestURI.indexOf("userInfo")>0||requestURI.indexOf("toForm")>0){  
			if(requestURI.indexOf("login")>0||requestURI.indexOf("register")>0||requestURI.indexOf("getUser")>0||requestURI.indexOf("download")>0||requestURI.indexOf("addUser")>0){
				return true;
			}
		//说明处在主页面  
            HttpSession session = request.getSession();  
            User user = (User) session.getAttribute("user");  
            System.out.println("拦截器取得session记录的user:"+user);
            if(user!=null){
            	if(user.getRole().equals("管理员")){
            		return true;
            	}
            	else{
            		if(requestURI.indexOf("map")>0||requestURI.indexOf("add")>0||requestURI.indexOf("submit")>0||requestURI.indexOf("down")>0||requestURI.indexOf("find")>0||requestURI.indexOf("Add")>0||requestURI.indexOf("list")>0||requestURI.indexOf("toDetails")>0||requestURI.indexOf("fileUpload")>0||requestURI.indexOf("to")>0||requestURI.indexOf("home")>0||requestURI.indexOf("main")>0||requestURI.indexOf("maintain")>0||requestURI.indexOf("repair")>0||requestURI.indexOf("contact")>0||requestURI.indexOf("userInfo")>0||requestURI.indexOf("toDetails")>0){
            			return true;
            		}
            		else{
            			request.setAttribute("msg", "您没有管理员权限，系统拒绝访问！");
                        request.getRequestDispatcher("WEB-INF/jsp/login.jsp").forward(request,response);
                		return false;
            		}
            	}
            }
               //没有登陆，给出提示信息并转向登陆界面  
            	request.setAttribute("msg", "您还没有登录，请先登录！");
                request.getRequestDispatcher("WEB-INF/jsp/login.jsp").forward(request,response);  
              return false;  
            
        }

}
