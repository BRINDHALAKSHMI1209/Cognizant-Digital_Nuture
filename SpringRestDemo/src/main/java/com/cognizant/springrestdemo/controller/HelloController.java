package com.cognizant.springrestdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello World RESTful Web Service";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Welcome to Cognizant Digital Nurture!";
    }
}