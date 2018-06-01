package com.car.service;

import java.util.List;

import com.car.po.Application;
import com.car.po.Basic;
import com.car.po.Operation;
import com.car.po.Review;

public interface BasicService {

	//operation操作
	public List<Operation> findOp();
	public Operation findOpById(int opId);
	//basic操作
	public List<Basic> queryAll();
	public Basic findById(int id);
	public void insert(Basic basic);
	public void update(Basic basic);
	public void delete(Basic basic);
	public List<Basic> findPart(String name);
	//Review操作
	public List<Review> findAll(int id);
	public void insert(Review review);
	//申请操作
	public void insert(Application application);
	
}
