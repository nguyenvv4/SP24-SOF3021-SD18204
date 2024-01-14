package com.example.sp24sd18204.controller;

import com.example.sp24sd18204.entity.SinhVien;
import com.example.sp24sd18204.entity.view.SinhVienViewModel;
import com.example.sp24sd18204.service.SinhVienService;
import com.example.sp24sd18204.service.impl.SinhVienServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class SinhVienController {
    ArrayList<SinhVien> listSinhVien = new ArrayList<>();

    @Autowired
    SinhVienService sinhVienService;


    public SinhVienController() {
        SinhVien sinhVien = new SinhVien("Ph12345", "Nguyen Van A", "Ha Noi", "Nam");
        listSinhVien.add(sinhVien);
        listSinhVien.add(new SinhVien("Ph12346", "Nguyen Van A", "Ha Noi", "Nam"));
    }

    @GetMapping("/hien-thi")
    String hienThiThongTin(Model model) {
        System.out.println("Da chay vao get");
        model.addAttribute("sinhVienViewModel", new SinhVienViewModel());
        model.addAttribute("listSinhVien", listSinhVien);
        return "index";
    }

//    @PostMapping("/addNew")
//    String addNew(@RequestParam("maSinhVien") String maSinhVien,
//                  @RequestParam("hoTen") String hoTen,
//                  @RequestParam("diaChi") String diaChi,
//                  @RequestParam("gioiTinh") String gioiTinh) {
//        System.out.println(gioiTinh);
//        SinhVien sinhVien = new SinhVien(maSinhVien, hoTen,diaChi,gioiTinh);
//        listSinhVien.add(sinhVien);
//        return "redirect:/hien-thi";
//    }

    @PostMapping("/addNew")
    String addNew(@Valid @ModelAttribute("sinhVienViewModel")SinhVienViewModel sinhVienViewModel,
                  BindingResult bindingResult,
                  Model model) {
        if (bindingResult.hasErrors()){
////            model.addAttribute("mé")
            return "index";
        }
        return "redirect:/hien-thi";
    }

    @GetMapping("/detail")
    String detail(Model model,
                  @RequestParam("id") String maSinhVien){
        SinhVien sinhVien = new SinhVien();
        for(SinhVien sv : listSinhVien){
            if(maSinhVien.equals(sv.getMaSinhVien())){
                sinhVien = sv;
            }
        }
        model.addAttribute("sinhVien", sinhVien);
        return "detail";
    }

    @PostMapping("/update")
    String update(@RequestParam("maSinhVien") String maSinhVien,
                  @RequestParam("hoTen") String hoTen,
                  @RequestParam("diaChi") String diaChi,
                  @RequestParam("gioiTinh") String gioiTinh){
        for (SinhVien sinhVien:listSinhVien){
            if (sinhVien.getMaSinhVien().equals(maSinhVien)){
                sinhVien.setDiaChi(diaChi);
                sinhVien.setGioiTinh(gioiTinh);
                sinhVien.setHoTen(hoTen);
            }
        }
        return "redirect:/hien-thi";
    }
    @GetMapping("/delete")
    String delete(@RequestParam("id") String maSinhVien){
        SinhVien sinhVien = new SinhVien();
        for (SinhVien sv:listSinhVien){
            if(sv.getMaSinhVien().equals(maSinhVien)){
                sinhVien = sv;
            }
        }
        listSinhVien.remove(sinhVien);
        return "redirect:/hien-thi";
    }

}
