package com.car.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.car.po.Application;
import com.car.po.Basic;
import com.car.po.Review;
import com.car.service.BasicService;
import com.car.utils.GetTime;

@Controller
public class BasicController {
	@Autowired
	public BasicService basicService;
	
	private static final Log logger = LogFactory.getLog(BasicController.class);
	String dispatchURL = "";
	
		@RequestMapping("/main")
		public String queryAll(Model model){
			logger.info("成功跳转到main！");
			List<Basic> basics = basicService.queryAll();
			for(Basic basic1:basics){
				basic1.setDate(GetTime.getTime());
			}
			System.out.println("获取时间"+GetTime.getTime());
			System.out.println("basics:"+basics);
			model.addAttribute("basics", basics);
			return "main";
		}
		
		@RequestMapping("/home")
		public String home(Model model){
			logger.info("成功跳转到home！");
			List<Basic> basics = basicService.queryAll();
			System.out.println("basics:"+basics);
			model.addAttribute("basics", basics);
			return "main";
		}
		
		@RequestMapping("/toDetails")
		public String toDetails(Model model,int id){
			logger.info("成功跳转到toDetails！");
			Basic basic = basicService.findById(id);
			model.addAttribute("basic", basic);
			List<Review> reviews = basicService.findAll(id);
			model.addAttribute("reviews", reviews);
			return "details";
		}
		
		/*
		 * 管理员操作
		 */
		
		@RequestMapping("/listBasic")
		public String listBasic(Model model){
			List<Basic> basics = basicService.queryAll();
			model.addAttribute("basics", basics);
			return "carList";
		}
		
		@RequestMapping("/toAddCar")
		public String toAddCar(Model model){
			logger.info("到toAddCar");
			return "addCar";
		}
		
		@RequestMapping("/AddCar")
		public String AddCar(Model model,Basic basic){
			logger.info("到AddCar");
			System.out.println(basic.getName());
//			basic.setName(basic.getName());
			basicService.insert(basic);
			model.addAttribute("msg", basic.getName()+"添加成功");
			listBasic(model);
			return "carList";
		}
		
		@RequestMapping("/toUpdateBasic")
		public String updateBasic(Model model,int id){
			Basic basic = basicService.findById(id);
			model.addAttribute("basic", basic);
			return "carUpdate";
		}
		
		@RequestMapping("/updateBasic")
		public String UpdateBasic(Model model,Basic basic){
			basicService.update(basic);
			model.addAttribute("msg", basic.getName()+"信息修改成功");
			listBasic(model);
			return "carList";
		}
		
		@RequestMapping("/deleteBasic")
		public String deleteBasic(Model model,int id){
			Basic basic = basicService.findById(id);
			basicService.delete(basic);
			model.addAttribute("msg", basic.getName()+"信息删除成功");
			listBasic(model);
			return "carList";
		}
		
		/*
		 * 评论模块
		 */
		@RequestMapping("/addReview")
		public String addReview(Model model,Review review){
			System.out.println("输入的评论"+review);
			basicService.insert(review);
			System.out.println("评论发表成功");
			model.addAttribute("msg", "评论发表成功");
			return "details";
		}
		
		@RequestMapping("/listReview")
		public String listReview(Model model,int id){
			System.out.println("点击reviews拿到的id"+id);
			List<Review> reviews = basicService.findAll(id);
			System.out.println("查出来的"+reviews);
			model.addAttribute("reviews", reviews);
			return "details";
		}
		
		@RequestMapping("/findPart")
		public String findPart(Model model,String name){
			List<Basic> basics = basicService.findPart(name);
			System.out.println("模糊查找到的"+basics);
			if(basics.isEmpty()){
				System.out.println("没有查到！");
				model.addAttribute("msg", "对不起，没有查到您要的信息！");
			}
			model.addAttribute("basics", basics);
			return "main";
		}
		
		/*申请模块*/
		@RequestMapping("/submit")
		public String submit(Model model,Application application){
			basicService.insert(application);
			model.addAttribute("msg", "尊敬的"+application.getAppName()+",您的申请已经递交成功,请耐心等待！");
			return "contact";
		}
	}

