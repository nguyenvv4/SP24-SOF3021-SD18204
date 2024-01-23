package com.example.sp24sd18204.service.impl;

import com.example.sp24sd18204.entity.Category;
import com.example.sp24sd18204.repository.CategoryRepository;
import com.example.sp24sd18204.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;
    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }
}
