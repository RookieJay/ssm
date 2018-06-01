package com.car.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	@RequestMapping("/register")
	public String register(){
		
		return "register";
	}
	
	@RequestMapping("/contact")
	public String contact(){
		return "contact";
	}
	
	
	@RequestMapping("/map")
	public String map(){
		return "map";
	}
	
	@RequestMapping("/toAdminAdd")
	public String toAdminAdd(){
		return "rightAdd";
	}
	
	
}
