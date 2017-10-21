package com.example.web.controller;

import com.example.web.config.AppPaths;
import com.example.web.dto.SellerDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InsertController {

    @RequestMapping(AppPaths.INSERT)
    public String get(Model model) {
        model.addAttribute("seller", new SellerDTO());
        return "insert";
    }
}
