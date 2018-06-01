package com.car.service;

import java.util.List;

import com.car.po.Passage;

public interface PassageService {

	public void add(Passage passage);
	public void delete(Passage passage);
	public void update(Passage passage);
	public List<Passage> findAll(); 
	public Passage findById(int psId);
	public List<Passage> findOPpassage(String opName);
}
