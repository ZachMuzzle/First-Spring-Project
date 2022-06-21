package com.example.Demo.tutorial.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import  org.springframework.web.bind.annotation.RestController;

@RestController // This is our controller
public class greetingController {
    @RequestMapping("/") //Default  is a GET request  @Home page.
    public String getGreeting() {
        return "This is the first Spring Boot App";
    }
}
