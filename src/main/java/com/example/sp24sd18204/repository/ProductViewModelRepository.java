package com.example.sp24sd18204.repository;

import com.example.sp24sd18204.entity.view.ProductViewModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductViewModelRepository extends JpaRepository<ProductViewModel, Integer> {

    @Query(value = "select p.id , p.name , p.price , c.name as category_name \n" +
            " FROM category c inner join Products p \n" +
            " ON p.category_id = c.id  ", nativeQuery = true)
    List<ProductViewModel> getAllProductViewModel();
}
