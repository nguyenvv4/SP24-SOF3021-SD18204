package com.example.sp24sd18204.service;

import com.example.sp24sd18204.entity.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    List<Category> getAll();

    void delete(Integer id);

    Category detail(Integer id);

    void update(Category category);

    void add(Category category);
}
