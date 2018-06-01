package com.car.converter;

import java.util.ArrayList;
import java.util.List;

import com.car.form.OperationForm;
import com.car.po.Operation;


public class OperationConverter {

	public static OperationForm toOperationForm(Operation Operation) {
		OperationForm OperationForm  = new OperationForm();
		Integer opId = Operation.getOpId();
		System.out.println(opId);
		OperationForm.setOpId(opId.toString());
		OperationForm.setOpName(Operation.getOpName());
		return OperationForm;
	}
	
	/*
	 * 2.将Operation的集合转换成OperationForm集合
	 */
	public static List<OperationForm> toOperationForms(List<Operation> operations){
		OperationForm OperationForm = new OperationForm();
		List<OperationForm> OperationForms = new ArrayList<OperationForm>();//创建OperationForms集合对象for
		 // 循环遍历categories 并将其转换为OperationForms
		//创建productForm对象
		for(Operation Operation:operations){
			OperationForm = toOperationForm(Operation);
			OperationForms.add(OperationForm);
		}
		return OperationForms;
	}
	
	/*
	 * 3.将OperationForm转换成Operation
	 */
	public static Operation toOperation(OperationForm OperationForm){
		Operation Operation = new Operation();
		Operation.setOpId(Integer.valueOf(OperationForm.getOpId()));
		Operation.setOpName(OperationForm.getOpName());
		return Operation;
	}
	
	/*
	 * 4.将OperationForms转换成categories
	 */
	public static List<Operation> toOperations(List<OperationForm> OperationForms){
		List<Operation> Operations = new ArrayList<Operation>();
		/*
		 * 循环遍历categories,并将其转换
		 */
		Operation Operation = new Operation();
		for(OperationForm OperationForm:OperationForms){
			Operation = toOperation(OperationForm);
			Operations.add(Operation);
		}
		return Operations;
	}
}
