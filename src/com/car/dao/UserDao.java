package com.car.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.car.po.Role;
import com.car.po.User;


public interface UserDao {
	public User findUser(@Param("email") String email,
						@Param("userPwd") String userPwd);
	public User findByUserId(@Param("userId") int userId);
	public void addUser(User user);
	public void deleteById(User user);
	public void updateById(User user);
	public List<User> queryAllUser();
	public Role queryAllRoleUser(@Param("userId") int userId);
	public User queryEmail(@Param("email") String email);
}
