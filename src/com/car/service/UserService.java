package com.car.service;

import java.util.List;


import com.car.po.Role;
import com.car.po.User;

public interface UserService {
	public User findUser(String userName, String userPwd);
	public User findByUserId(int userId);
	public void updateById(User user);
	public void deleteById(User user);
	public void addUser(User user);
	public List<User> queryAllUser();
	public Role queryAllRoleUser(int userId);
	public User queryEmail(String email);
}
