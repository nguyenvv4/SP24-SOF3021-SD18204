package com.example.sp24sd18204.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    // khai báo request theo cách 1
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    String home(Model model) {
        System.out.println("da chay vao day");
        String name = "Nguyen Van A";
        model.addAttribute("hoTen", name);
        return "index";
    }

    // cach 2
    @GetMapping("/x")
    String home1() {
        System.out.println("da chay vao day ahiahi");
        return "";
    }
}
