package com.example.transferserviceapi.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
    @GetMapping("/")
    public String home() {
        return "redirect:/index.html";
    }
}
