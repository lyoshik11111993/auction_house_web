package com.example.web.controller;

import com.example.web.config.AppPaths;
import com.example.web.dto.BidDTO;
import com.example.web.dto.BuyerDTO;
import com.example.web.dto.ProductDTO;
import com.example.web.dto.SellerDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InsertController {

    @RequestMapping(AppPaths.INSERT)
    public String get(Model model) {
        model.addAttribute("seller", new SellerDTO());
        model.addAttribute("buyer", new BuyerDTO());
        model.addAttribute("product", new ProductDTO());
        model.addAttribute("bid", new BidDTO());
        return "insert";
    }
}
