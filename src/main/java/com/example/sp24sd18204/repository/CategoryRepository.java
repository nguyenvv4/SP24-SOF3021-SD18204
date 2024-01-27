package com.example.sp24sd18204.repository;

import com.example.sp24sd18204.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

    List<Category> findAllByOrderByNameAsc();
}
