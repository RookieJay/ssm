package com.car.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.car.po.Basic;
public interface BasicDao {

	public Basic findById(@Param("id") int id);
	public void add(Basic basic);
	public void delete(Basic basic);
	public void update(Basic basic);
	public List<Basic> queryAll();
	public List<Basic> findPart(@Param("name") String name);
}