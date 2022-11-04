package com.example.PropertyManagement.controller;

public class CalculatorMain {

    public static void main(String[] args){
        CalculatorController s = new CalculatorController();
        Double result = s.add(1.2,1.3,5.0);
        System.out.println(result);
    }
}
