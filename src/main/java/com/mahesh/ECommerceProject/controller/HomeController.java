package com.mahesh.ECommerceProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.mahesh.ECommerceProject.entity.User;
import com.mahesh.ECommerceProject.repository.UserRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/index")
    public String getIndexPage() {
        return "index";
    }

    @PostMapping(value = "/register")
    public String createUser(@ModelAttribute User u, HttpSession session) {
        System.out.println(u);
        userRepository.save(u);

        session.setAttribute("message", "Registration Successful");
        return "redirect:/"; // Redirect to your index page or another appropriate page
    }
}