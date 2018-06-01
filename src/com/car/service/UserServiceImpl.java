package com.car.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.car.dao.RoleDao;
import com.car.dao.UserDao;
import com.car.po.Role;
import com.car.po.User;
/*
 * 1.@Service标识业务层的实现类	
   2.使用@Transactional注解来将标识类中的所有方法都纳入Spring的事务管理
*/
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	//注入UserDao
	@Autowired
	private UserDao userDao;
	@Autowired
	private RoleDao roleDao;
	//通过账号密码来查询用户
	@Override
	public User findUser(String userName, String userPwd) {
		User user = userDao.findUser(userName, userPwd);
		return user;
	}
	@Override
	public User findByUserId(int userId) {
		User user= userDao.findByUserId(userId);
		System.out.println("成功查询到用户信息！");
		return user;
	}
	
	@Override
	public void updateById(User user) {
		// TODO Auto-generated method stub
		userDao.updateById(user);
		System.out.println("成功修改用户信息！");
	}
	@Override
	public void deleteById(User user) {
		// TODO Auto-generated method stub
		userDao.deleteById(user);
		System.out.println("成功删除用户信息！");
	}
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userDao.addUser(user);
		System.out.println("成功增加用户信息！");
	}
	@Override
	public List<User> queryAllUser() {
		// TODO Auto-generated method stub
		System.out.println("从数据库查到的user信息"+userDao.queryAllUser());
		return userDao.queryAllUser();
	}
	@Override
	public Role queryAllRoleUser(int roleId) {
		// TODO Auto-generated method stub
		Role role = userDao.queryAllRoleUser(roleId);
		return role;
	}
	@Override
	public User queryEmail(String email) {
		// TODO Auto-generated method stub
		User user = userDao.queryEmail(email);
		return user;
	}
	
	

	

}
