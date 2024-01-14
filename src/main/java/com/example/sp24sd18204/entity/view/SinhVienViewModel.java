package com.example.sp24sd18204.entity.view;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SinhVienViewModel {

    private String hoTen;

    private String diaChi;

    @Override
    public String toString() {
        return "SinhVienViewModel{" +
                "hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
