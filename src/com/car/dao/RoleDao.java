package com.car.dao;

import org.apache.ibatis.annotations.Param;

import com.car.po.Role;

public interface RoleDao {

	public Role queryRole(@Param("roleId") int roleId);
	
}
