package com.car.dao;

import com.car.po.Feature;

public interface FeatureDao {


    int deleteByPrimaryKey(Integer featureId);

    int insert(Feature record);

    int insertSelective(Feature record);


    Feature selectByPrimaryKey(Integer featureId);


    int updateByPrimaryKeySelective(Feature record);

    int updateByPrimaryKey(Feature record);
}