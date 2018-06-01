package com.car.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.car.dao.RoleDao;
import com.car.po.Role;

@Service("roleService")
@Transactional
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao roleDao;
	@Override
	public Role queryRole(int roleId) {
		// TODO Auto-generated method stub
		System.out.println("数据库查到"+roleDao.queryRole(roleId));
		return roleDao.queryRole(roleId);
	}


}
