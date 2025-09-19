package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping
    public String greet()
    {
        return "Welcome to our web application!\n\nThis is Devops assignment number 8";
    }
}
