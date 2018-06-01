package com.car.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.car.po.Operation;

public interface OperationDao {

	public List<Operation> findOp();
	public Operation findOpById(@Param("opId") int opId);
}
