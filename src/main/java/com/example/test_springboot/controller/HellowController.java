package com.example.test_springboot.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class HellowController {
    @RequestMapping(value = "/resthellow")
    public String hellow() {
    return "welcome to My World !! ";
    }
}