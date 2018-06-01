package com.car.converter;

import java.util.ArrayList;
import java.util.List;

import com.car.form.UserForm;
import com.car.po.User;


public class UserConverter {

	//将User转化成form
	public static UserForm toUserForm(User user){
		UserForm userForm = new UserForm();
		Integer userId = user.getUserId();
		String role = user.getRole();
		userForm.setUserId(userId.toString());
		userForm.setUserName(user.getUserName());
		userForm.setUserPwd(user.getUserPwd());
		userForm.setEmail(user.getEmail());
		userForm.setTel(user.getTel());
		userForm.setSex(user.getSex());
		userForm.setRole(role);
		return userForm;
	}
	//将Users转化成forms
	public static List<UserForm> toUserForms(List<User> users){
		UserForm UserForm  = new UserForm();
		//User User = new User();
		List<UserForm> UserForms = new ArrayList<UserForm>();
		for(User user:users){
			UserForm = toUserForm(user);
			UserForms.add(UserForm);
		}
		return UserForms;
	}
	
	//form->User
	public static User toUser(UserForm userForm){
		User user  = new User();
//		user.setUserId(Integer.valueOf(userForm.getUserId()));
		user.setUserName(userForm.getUserName());
		user.setUserPwd(userForm.getUserPwd());
		user.setEmail(userForm.getEmail());
		user.setTel(userForm.getTel());
		user.setSex(userForm.getSex());
		user.setRole(userForm.getRole());
		
		return user;
	}
	
	//forms->Users
	public static List<User> toUsers(List<UserForm> userForms){
		User user  = new User();
		//User User = new User();
		List<User> users = new ArrayList<User>();
		for(UserForm userForm:userForms){
			user = toUser(userForm);
			users.add(user);
		}
		return users;
	}
	
	
	
}