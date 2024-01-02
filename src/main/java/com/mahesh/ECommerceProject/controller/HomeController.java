package com.mahesh.ECommerceProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/index")
    public String getIndexPage() {
        return "index";
    }
    
}
