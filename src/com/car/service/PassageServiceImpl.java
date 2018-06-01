package com.car.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.car.dao.PassageDao;
import com.car.po.Passage;


@Service("passageService")
@Transactional
public class PassageServiceImpl implements PassageService{

	@Autowired
	PassageDao passageDao;
	
	@Override
	public void add(Passage passage) {
		// TODO Auto-generated method stub
		passageDao.addPassage(passage);
	}

	@Override
	public void delete(Passage passage) {
		// TODO Auto-generated method stub
		passageDao.deletePassage(passage);
	}

	@Override
	public void update(Passage passage) {
		// TODO Auto-generated method stub
		passageDao.updatePassage(passage);
	}

	@Override
	public List<Passage> findAll() {
		// TODO Auto-generated method stub
		System.out.println("跳转到service查到的全部是："+passageDao.queryAll());
		return passageDao.queryAll();
	}

	@Override
	public Passage findById(int psId) {
		// TODO Auto-generated method stub
		return passageDao.findById(psId);
	}

	@Override
	public List<Passage> findOPpassage(String opName) {
		// TODO Auto-generated method stub
		return passageDao.findOPpassage(opName);
	}

}
