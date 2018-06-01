package com.car.validator;

import java.util.ArrayList;
import java.util.List;

import com.car.form.PassageForm;


public class PassageValidator {
	public List<String> validate(PassageForm PassageForm)
	{
		List<String> errors = new ArrayList<String>();
		String PsTitle = PassageForm.getPsTitle();
		String PsContent = PassageForm.getPsContent();
		String PoId = PassageForm.getOpName();
		if (PsTitle == null || PsTitle.trim().isEmpty())
		{
			errors.add("文章必须有标题！");
		}
		if (PsContent == null || PsContent.trim().isEmpty())
		{
			errors.add("文章必须有内容！");
		}
		if (PoId == null || PoId.trim().isEmpty())
		{
			errors.add("文章必须有类别！");
		}
		return errors;
	}
	
}
