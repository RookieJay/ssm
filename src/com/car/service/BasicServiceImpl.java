package com.car.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.car.dao.ApplicationDao;
import com.car.dao.BasicDao;
import com.car.dao.OperationDao;
import com.car.dao.ReviewDao;
import com.car.po.Application;
import com.car.po.Basic;
import com.car.po.Operation;
import com.car.po.Review;



@Service("basicService")
@Transactional
public class BasicServiceImpl implements BasicService {

	@Autowired
	private OperationDao operationDao;
	@Autowired
	private BasicDao basicDao;
	@Autowired
	private ReviewDao reviewDao;
	@Autowired
	private ApplicationDao applicationDao;
	
	@Override
	public List<Operation> findOp() {
		// TODO Auto-generated method stub
		return operationDao.findOp();
	}
	@Override
	public Operation findOpById(int opId) {
		// TODO Auto-generated method stub
		return operationDao.findOpById(opId);
	}
	@Override
	public List<Basic> queryAll() {
		// TODO Auto-generated method stub
		return basicDao.queryAll();
	}
	@Override
	public Basic findById(int id) {
		// TODO Auto-generated method stub
		return basicDao.findById(id);
	}
	@Override
	public void insert(Basic basic) {
		// TODO Auto-generated method stub
		basicDao.add(basic);
	}
	@Override
	public void update(Basic basic) {
		// TODO Auto-generated method stub
		basicDao.update(basic);
	}
	@Override
	public void delete(Basic basic) {
		// TODO Auto-generated method stub
		basicDao.delete(basic);
	}
	@Override
	public List<Review> findAll(int id) {
		// TODO Auto-generated method stub
		return reviewDao.findAll(id);
	}
	@Override
	public void insert(Review review) {
		// TODO Auto-generated method stub
		reviewDao.insert(review);
	}
	@Override
	public List<Basic> findPart(String name) {
		// TODO Auto-generated method stub
		System.out.println("service开始模糊查找");
		List<Basic> basics = basicDao.findPart(name);
		System.out.println("找到的"+basics);
		return basicDao.findPart(name);
	}
	@Override
	public void insert(Application application) {
		// TODO Auto-generated method stub
		applicationDao.insert(application);
	}
	
	
}
