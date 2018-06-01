package com.car.form;

public class RoleForm {

	public String roleId;
	public String roleName;
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	@Override
	public String toString() {
		return "RoleForm [roleId=" + roleId + ", roleName=" + roleName + "]";
	}
	
}
