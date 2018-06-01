package com.car.dao;

import com.car.po.Images;

public interface ImagesDao {

    int deleteByPrimaryKey(Integer imageId);

    int insert(Images record);

    int insertSelective(Images record);

    Images selectByPrimaryKey(Integer imageId);

    int updateByPrimaryKeySelective(Images record);

    int updateByPrimaryKey(Images record);
}