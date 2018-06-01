package com.car.converter;

import java.util.ArrayList;
import java.util.List;

import com.car.form.RoleForm;
import com.car.po.Role;


public class RoleConverter {

	//将Role转化成form
	public static RoleForm toRoleForm(Role Role){
		RoleForm RoleForm = new RoleForm();
		Integer roleId = Role.getRoleId();
		RoleForm.setRoleId(roleId.toString());
		RoleForm.setRoleName(Role.getRoleName());
		return RoleForm;
	}
	//将Roles转化成forms
	public static List<RoleForm> toRoleForms(List<Role> Roles){
		RoleForm RoleForm  = new RoleForm();
		//Role Role = new Role();
		List<RoleForm> RoleForms = new ArrayList<RoleForm>();
		for(Role Role:Roles){
			RoleForm = toRoleForm(Role);
			RoleForms.add(RoleForm);
		}
		return RoleForms;
	}
	
	//form->Role
	public static Role toRole(RoleForm RoleForm){
		Role Role  = new Role();
		Role.setRoleId(Integer.valueOf(RoleForm.getRoleId()));
		Role.setRoleName(RoleForm.getRoleName());
		return Role;
	}
	
	//forms->Roles
	public static List<Role> toRoles(List<RoleForm> RoleForms){
		Role Role  = new Role();
		//Role Role = new Role();
		List<Role> Roles = new ArrayList<Role>();
		for(RoleForm RoleForm:RoleForms){
			Role = toRole(RoleForm);
			Roles.add(Role);
		}
		return Roles;
	}
	
	
	
}