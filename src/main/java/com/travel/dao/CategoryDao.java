package com.travel.dao;

import com.travel.domain.Category;

import java.util.List;


public interface CategoryDao {
    List<Category> findAll();
}
