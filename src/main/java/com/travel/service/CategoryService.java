package com.travel.service;

import com.travel.domain.Category;

import java.util.List;

public interface CategoryService {
    /**
     * 查询所有
     * @return
     */
    List<Category> findAll();

}
