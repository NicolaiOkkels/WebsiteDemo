package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String home() {
        return ("home");
    }

    @GetMapping("/popular")
    public String popularMovies() {
        return ("popular");
    }

    @GetMapping("/worst")
    public String worstMovies() {
        return ("worst");
    }

    @GetMapping("/earning")
    public String bestEarningMovies() {
        return ("earning");
    }
}
