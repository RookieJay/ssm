package com.car.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.car.converter.UserConverter;
import com.car.form.UserForm;
import com.car.po.Basic;
import com.car.po.User;
import com.car.service.BasicService;
import com.car.service.UserService;
import com.car.validator.UserValidator;
import com.fasterxml.jackson.databind.util.JSONPObject;

@Controller
//@RequestMapping("value=/car")
//@SessionAttributes("user") 可以将user对象保存在session中
public class UserController {
	private static final Log logger = LogFactory.getLog(UserController.class);
	//注入UserService依赖
	@Autowired
	private UserService userservice;
	@Autowired
	private BasicService basicService;
	
	String url = "";
	/*
	 * 用户登录
	 */
	@RequestMapping("/login")
	public String login(String email, String userPwd, Model model,HttpSession session){
			logger.info("加载到login");
			System.out.println("从前端输入的email:"+email+"，userPwd:"+userPwd);
			User user;
			try{
					user = userservice.findUser(email, userPwd);
					System.out.println("根据输入的邮箱密码从数据库查询到的user登录信息:"+user);
					String role = user.getRole();
					System.out.println("role"+role);
					session.setAttribute("user", user);
					if(role.equals("用户")){
						//添加对象到Session
						List<Basic> basics = basicService.queryAll();
						model.addAttribute("basics", basics);
						return "main";
					}
					if(role.equals("管理员")){
						//添加对象到Session
						return "main1";
					}
				}
			catch (Exception e) {
				System.out.println("账号或密码错误，请重新输入");
				model.addAttribute("msg", "账号或密码错误，请重新输入！");
			}
			return "login";
	}
	
	/*@RequestMapping("/sessionTest")
	public String sessionTest(){
		return "sessionTest";
	}*/
	
	//用户注销
	@RequestMapping("/logout")
	public String outLogin(HttpSession session){
		//通过session.invalidata()方法来注销当前的session
		session.invalidate();
		return "login";
	}
	
	//头像
	@RequestMapping("/avatar")
	public String avatar(){
		return "avatar";
	}
	
	//用户信息查看
	@RequestMapping("/userInfo")
	public String findByuserID(Model model, HttpSession session){
		System.out.println("点击个人信息看到页面session中记录的user信息:"+session.getAttribute("user"));
		User user = (User) session.getAttribute("user");
		int userId = user.getUserId();
		User user1 = userservice.findByUserId(userId);
		System.out.println("根据userId查到的user信息："+user1);
		UserForm userForm = UserConverter.toUserForm(user1);
		model.addAttribute("userForm", userForm);
		return "userUpdate";
	}
	
	//用户修改
	@RequestMapping(value="/update", method={RequestMethod.POST,RequestMethod.GET})
	public String update(Model model,UserForm userForm){
		System.out.println("点击了修改，当前的userForm："+userForm);
		UserValidator userValidator = new UserValidator();
		List<String> errors = userValidator.validate(userForm); 
		if(errors.isEmpty()){
			User user = new User();
			user.setUserId(Integer.valueOf(userForm.getUserId()));
			user.setUserName(userForm.getUserName());
			user.setUserPwd(userForm.getUserPwd());
			user.setSex(userForm.getSex());
			user.setEmail(userForm.getEmail());
			user.setTel(userForm.getTel());
			System.out.println(user.getUserPwd());
			userservice.updateById(user);
			model.addAttribute("userForm", userForm);
			return "userUpdate";
		}
		else{
			System.out.println("格式有误！");
			return "userUpdate";
		}
	}
	
	//用户注册
	@RequestMapping("/addUser")
	public String addUser(Model model,UserForm userForm){
		UserValidator userValidator = new UserValidator();
		List<String> errors = userValidator.validate(userForm); 
		String email = userForm.email;
		User exEmail = userservice.queryEmail(email);
		if (exEmail!=null){
			model.addAttribute("msg", "此邮箱已经注册，请重新注册！");
			return "register";
		}
		else if(errors.isEmpty()){
			User user = new User();
			user.setUserName(userForm.getUserName());
			user.setUserPwd(userForm.getUserPwd());
			user.setSex(userForm.getSex());
			user.setEmail(userForm.getEmail());
			user.setTel(userForm.getTel());
			userservice.addUser(user);
			model.addAttribute("userForm", userForm);
			model.addAttribute("msg", "注册成功，快去登录吧！");
			return "login";
		}
		else {
			model.addAttribute("msg", "注册失败，请重新注册！");
			return "register";
		}
	}
		
	
	
	//用户列表
	@RequestMapping("/listUser")
	public String listUser(Model model,UserForm userForm){
		List<User> users = userservice.queryAllUser();
		logger.info("users:"+users);
		List<UserForm> userForms = UserConverter.toUserForms(users);
		System.out.println(userForms);
		model.addAttribute("userForms", userForms);
		return "right";
	}
	
	//管理员删除用户
	@RequestMapping("/deleteUser")
	public String deleteUser(Model model,int userId){
		System.out.println("删除时传的userID"+userId);
		User user = userservice.findByUserId(userId);
		System.out.println("要删除的user"+user);
		userservice.deleteById(user);
		List<User> users = userservice.queryAllUser();
		List<UserForm> userForms = UserConverter.toUserForms(users);
		model.addAttribute("userForms", userForms);
		return "right";
	}
	
	//批量删除
	@RequestMapping("/deleteUsers")
	public String deleteUsers(Model model,int[] ids){
		if(ids!=null&&ids.length!=0)
		{
			for(int userId:ids){
				System.out.println("选中的userId有"+userId);
				User user = userservice.findByUserId(userId);
				userservice.deleteById(user);
				List<User> users =userservice.queryAllUser();
				List<UserForm> userForms = UserConverter.toUserForms(users);
				model.addAttribute("userForms", userForms);
				model.addAttribute("msg", "成功删除"+user.getUserName()+"的用户信息");
			}
			
		}
		else
		{
			List<User> users =userservice.queryAllUser();
			List<UserForm> userForms = UserConverter.toUserForms(users);
			model.addAttribute("userForms", userForms);
			model.addAttribute("msg", "请选中要批量删除的用户！");
		}
		return "right";
	}

	//到用户修改页面
	@RequestMapping("/toAdminUpdate")
	public String toAdminUpdate(int userId,Model model){
		System.out.println("点击修改拿到的id："+userId);
		User user = userservice.findByUserId(userId);
		UserForm userForm = UserConverter.toUserForm(user);
//		if(userForm.getRoleId()=="1011"){
//			userForm.setRoleId("管理员");
//		}
//		else{
//			userForm.setRoleId("用户");
//		}
		System.out.println("到达修改页面，拿到的userForm"+userForm);
		model.addAttribute("userForm", userForm);
		return "rightUpdate";
	}
	
	//管理员修改
	@RequestMapping("/adminUpdate")
	public String adminUpdate(Model model,UserForm userForm){
		UserValidator userValidator = new UserValidator();
		List<String> errors = userValidator.validate(userForm); 
		if(errors.isEmpty()){
			User user = new User();
			user.setUserId(Integer.valueOf(userForm.getUserId()));
			user.setUserName(userForm.getUserName());
			user.setUserPwd(userForm.getUserPwd());
			user.setSex(userForm.getSex());
			user.setEmail(userForm.getEmail());
			user.setTel(userForm.getTel());
			System.out.println(user.getUserPwd());
			userservice.updateById(user);
			model.addAttribute("msg", "用户"+user.getUserName()+"信息修改成功");
			List<User> users = userservice.queryAllUser();
			List<UserForm> userForms = UserConverter.toUserForms(users);
			model.addAttribute("userForms", userForms);
			return "right";
		}
		else{
			System.out.println("格式有误！");
			List<User> users = userservice.queryAllUser();
			List<UserForm> userForms = UserConverter.toUserForms(users);
			model.addAttribute("userForms", userForms);
			model.addAttribute("msg", "格式有误，请重新输入！");
			return "rightUpdate";
		}
	}
	
	//管理员添加
	@RequestMapping("/adminAdd")
	public String adminAdd(Model model,UserForm userForm){
		UserValidator userValidator = new UserValidator();
		List<String> errors = userValidator.validate(userForm); 
		String email = userForm.email;
		User exEmail = userservice.queryEmail(email);
		if (exEmail!=null){
			model.addAttribute("msg", "此邮箱已经注册，请重新添加！");
			return "rightAdd";
		}
		else if(errors.isEmpty()){
			User user = new User();
			user.setUserName(userForm.getUserName());
			user.setUserPwd(userForm.getUserPwd());
			user.setSex(userForm.getSex());
			user.setEmail(userForm.getEmail());
			user.setTel(userForm.getTel());
			userservice.addUser(user);
			model.addAttribute("userForm", userForm);
			model.addAttribute("msg", "用户"+userForm.getUserName()+"添加成功");
			List<User> users = userservice.queryAllUser();
			List<UserForm> userForms = UserConverter.toUserForms(users);
			model.addAttribute("userForms", userForms);
			return "right";
		}
		else {
			model.addAttribute("msg", "添加失败，请重新添加！");
			return "rightAdd";
		}
	}
	
//	@ResponseBody注解的作用是将controller的方法返回的对象通过适当的转换器转换为指定的格式之后，写入到response对象的body区，通常用来返回JSON数据或者是XML数据，
//	  需要注意的是，在使用此注解之后不会再走视图处理器，而是直接将数据写入到输入流中，他的效果等同于通过response对象输出指定格式的数据。
	 
	@RequestMapping(value="/getUser")
	@ResponseBody
	public List<User> jsonTest(User user){
		List<User> users = userservice.queryAllUser();
		return users;
	}
	
}
