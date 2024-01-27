package com.example.sp24sd18204.controller;

import com.example.sp24sd18204.entity.Category;
import com.example.sp24sd18204.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/category/hien-thi")
    public String getAll(Model model) {
        List<Category> list = categoryService.getAll();
        model.addAttribute("list", list);
        return "category";
    }

    @GetMapping("/category/delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        categoryService.delete(id);
        return "redirect:/category/hien-thi";
    }

    @GetMapping("/category/detail/{id}")
    public String detail(Model model, @PathVariable("id") Integer id) {
        Category category = categoryService.detail(id);
        model.addAttribute("category", category);
        return "category-detail";
    }

    @PostMapping("/category/update/{id}")
    public String update(@PathVariable("id") Integer id,
                         @RequestParam("name") String name) {
        Category category = new Category(id, name);
        categoryService.update(category);

        return "redirect:/category/hien-thi";
    }

    @PostMapping("/category/save")
    public String add(@RequestParam("name") String name) {
        Category category = new Category();
        category.setName(name);
        categoryService.add(category);

        return "redirect:/category/hien-thi";
    }

}
