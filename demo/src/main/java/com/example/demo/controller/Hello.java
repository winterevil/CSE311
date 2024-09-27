package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class Hello {
    @RequestMapping("/")
    public String requestMethodName() {
        return "index";
    }

}