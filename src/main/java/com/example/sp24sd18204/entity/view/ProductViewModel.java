package com.example.sp24sd18204.entity.view;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProductViewModel {

    @Id
    private Integer id;

    private String name ;

    private Long price;

    private String categoryName;

    @Override
    public String toString() {
        return "ProductViewModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}
