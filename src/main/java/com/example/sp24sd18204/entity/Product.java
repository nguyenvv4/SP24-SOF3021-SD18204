package com.example.sp24sd18204.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "Products")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name ;

    private String images;

    private Date createDate;

    private Long price;

    private Integer available;

    @ManyToOne()
    @JoinColumn(name = "category_id")
    private Category category;
}
