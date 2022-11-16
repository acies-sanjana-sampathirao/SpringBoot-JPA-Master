package com.example.PropertyManagement.controller;

import com.example.PropertyManagement.service.impl.PropertyServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;

public class CalculatorMain {
    @Autowired
    public static PropertyServiceimpl calculatorController;
    public static void main(String[] args){

        PropertyServiceimpl s = new PropertyServiceimpl();
        Double result = s.add(1.2,1.3);
        System.out.println(result);
    }

}
