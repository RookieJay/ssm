package com.car.dao;

import com.car.po.Sale;

public interface SaleDao {


    int deleteByPrimaryKey(Integer saleId);

    int insert(Sale record);

    int insertSelective(Sale record);

    Sale selectByPrimaryKey(Integer saleId);

    int updateByPrimaryKeySelective(Sale record);

    int updateByPrimaryKey(Sale record);
}