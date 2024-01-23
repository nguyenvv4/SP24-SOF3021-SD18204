package com.example.sp24sd18204.controller;

import com.example.sp24sd18204.entity.Category;
import com.example.sp24sd18204.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/category/hien-thi")
    public String getAll(){
        List<Category> list = categoryService.getAll();
        for (Category category: list){
            System.out.println(category.toString());
        }
        return null;
    }
}
