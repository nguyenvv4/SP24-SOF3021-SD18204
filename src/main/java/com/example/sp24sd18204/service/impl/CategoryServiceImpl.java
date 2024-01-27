package com.example.sp24sd18204.service.impl;

import com.example.sp24sd18204.entity.Category;
import com.example.sp24sd18204.repository.CategoryRepository;
import com.example.sp24sd18204.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;
    @Override
    public List<Category> getAll() {
        return categoryRepository.findAllByOrderByNameAsc();
    }

    @Override
    public void delete(Integer id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public Category detail(Integer id) {
        return categoryRepository.findById(id).get();
    }

    @Override
    public void update(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void add(Category category) {
        categoryRepository.save(category);
    }
}
