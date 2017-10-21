package com.example.web.controller;

import com.example.web.config.AppPaths;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InsertController {

    @RequestMapping(AppPaths.INSERT)
    public String get() {
        return "insert";
    }
}
