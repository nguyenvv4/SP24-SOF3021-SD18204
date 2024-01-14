package com.example.sp24sd18204.entity.view;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SinhVienViewModel {

    @NotBlank(message = "Ho ten khong duoc de trong")
    private String hoTen;

    @NotBlank(message = "Dia chi khong duoc de trong")
    private String diaChi;

    @Override
    public String toString() {
        return "SinhVienViewModel{" +
                "hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
