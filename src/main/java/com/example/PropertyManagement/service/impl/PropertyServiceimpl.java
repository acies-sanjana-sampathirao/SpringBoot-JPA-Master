package com.example.PropertyManagement.service.impl;

import com.example.PropertyManagement.dto.Propertydto;
import com.example.PropertyManagement.service.PropertyService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@AllArgsConstructor
public class PropertyServiceimpl implements PropertyService{
    @Override
    public Propertydto saveProperty(Propertydto propertydto) {
        return null;
    }
    @Override
    public Double add(Double num1, Double num2){
        return num1+num2;
    }

}

