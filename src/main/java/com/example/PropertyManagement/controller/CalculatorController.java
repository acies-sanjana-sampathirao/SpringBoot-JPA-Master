package com.example.PropertyManagement.controller;

import com.example.PropertyManagement.dto.CalculatorDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/calculator") //class level mapping  of url to controller class
public class CalculatorController {

//    http://localhost:8080/api/v1/calculator/add
//    http://localhost:8080/api/v1/calculator/add?num11=2.7&num22=3.3 (REST ful webservice)

    @GetMapping("/add") //method level mapping of a url to a controller function
    public Double add(@RequestParam("num11") Double num1, @RequestParam("num22") Double num2){
        return num1+num2;
    }

//    http://localhost:8080/api/v1/calculator/sub/4.8/3.2
    @GetMapping("/sub/{num1}/{num2}") //Map the values of url to java variable by path variable method
    public Double subtract(@PathVariable("num1") Double num1, @PathVariable("num2") Double num2){
        Double result = null;
        if (num1>num2){
            result = num1-num2;
        }else{
            result = num2-num1;
        }
        return result;
    }

//    http://localhost:8080/api/v1/calculator/add/1.2?num11=2.7&num22=3.3
    @GetMapping("/add/{num3}") //method level mapping of a url to a controller function
    public Double add(@RequestParam("num11") Double num1, @RequestParam("num22") Double num2,  @PathVariable("num3") Double num3){
        return num1+num2;
    }

    @PostMapping("/mul")
    public Double multiply(@RequestBody CalculatorDto CalculatorDto){
        Double result = null;
        result = CalculatorDto.getNum1() * CalculatorDto.getNum2() * CalculatorDto.getNum3() * CalculatorDto.getNum4();
        return result;
    }
}
