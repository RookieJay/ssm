package com.car.validator;

import java.util.ArrayList;
import java.util.List;

import com.car.form.UserForm;


public class UserValidator {
	public List<String> validate(UserForm UserForm)
	{
		List<String> errors = new ArrayList<String>();
		String username = UserForm.getUserName();
		String userpwd = UserForm.getUserPwd();
		String sex = UserForm.getSex();
		String email = UserForm.getEmail();
		String tel = UserForm.getTel();
		if (username == null || username.trim().isEmpty())
		{
			errors.add("用户必须有名称！");
		}
		if (userpwd == null || userpwd.trim().isEmpty())
		{
			errors.add("用户必须有密码！");
		}
		if (sex == null || sex.trim().isEmpty())
		{
			errors.add("用户必须有性别！");
		}
		if (email == null || email.trim().isEmpty())
		{
			errors.add("用户必须有邮箱！");
		}
		if (tel == null || tel.trim().isEmpty())
		{
			errors.add("用户必须有电话！");
		}
		
		return errors;
	}
	
}
