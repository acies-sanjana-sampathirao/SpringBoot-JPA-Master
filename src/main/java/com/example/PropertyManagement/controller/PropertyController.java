package com.example.PropertyManagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Converting a java class and java function into REST ful webservice(so it can be accessed through HTTP protocol)
@RestController
@RequestMapping("/api/v1/properties")
 public class PropertyController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello ";
    }
}
