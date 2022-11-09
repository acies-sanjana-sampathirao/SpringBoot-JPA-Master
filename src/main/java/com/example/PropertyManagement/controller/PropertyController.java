package com.example.PropertyManagement.controller;

import com.example.PropertyManagement.dto.Propertydto;
import com.example.PropertyManagement.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//Converting a java class and java function into REST ful webservice(so it can be accessed through HTTP protocol)
@RestController
@RequestMapping("/api/v1")
 public class PropertyController {

    @Autowired
    private PropertyService propertyService;

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello ";
    }
    @PostMapping("/properties")
    public Propertydto saveProperty(@RequestBody Propertydto propertydto){
             System.out.println(propertydto);
             return propertydto;
    }
}
