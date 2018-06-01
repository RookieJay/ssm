package com.car.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.car.po.Passage;

public interface PassageDao {

	public Passage findById(@Param("psId") int psId);
	public void addPassage(Passage passage);
	public List<Passage> queryAll();
	public void deletePassage(Passage passage);
	public void updatePassage(Passage passage);
	public List<Passage> findPassage();
	public List<Passage> findOPpassage(@Param("opName") String opName);
}
