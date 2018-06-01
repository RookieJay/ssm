package com.car.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.car.po.Review;

public interface ReviewDao {

    public void insert(Review review);
    public List<Review> findAll(@Param("id") int id);
}