package com.example.sp24sd18204.controller;

import com.example.sp24sd18204.entity.Product;
import com.example.sp24sd18204.entity.view.ProductViewModel;
import com.example.sp24sd18204.repository.ProductRepository;
import com.example.sp24sd18204.repository.ProductViewModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductViewModelRepository productViewModelRepository;

    @GetMapping("/product/hien-thi")
    String hienThi() {
//        List<Product> list = productRepository.findAll();
//        for (Product pr : list) {
//            System.out.println(pr.getName() + "---" + pr.getCategory().getName());
//        }
        List<ProductViewModel> productViewModelList = productViewModelRepository.getAllProductViewModel();
        for(ProductViewModel productViewModel: productViewModelList){
            System.out.println(productViewModel.toString());
        }
        return null;
    }
}
