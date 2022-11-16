package com.example.PropertyManagement.controller;

import com.example.PropertyManagement.dto.CalculatorDto;
import com.example.PropertyManagement.service.impl.PropertyServiceimpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/calculator") //class level mapping  of url to controller class
public class CalculatorController {

    PropertyServiceimpl propertyServiceimpl;
    public CalculatorController(PropertyServiceimpl propertyServiceimpl) {
        this.propertyServiceimpl = propertyServiceimpl;
    }

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

    public double result(String type,double num1,double num2) {
        Double output = (num1 > num2) ? num1 + num2 : num1 - num2;
        System.out.println(output);
        return output;
    }

//    http://localhost:8080/api/v1/calculator/add/1.2?num11=2.7&num22=3.3
    @GetMapping("/add/{num3}") //method level mapping of a url to a controller function
    public Double add(@RequestParam("num11") Double num1, @RequestParam("num22") Double num2,  @PathVariable("num3") Double num3){
        return num1+num2;
    }

    @PostMapping("/mul")
    public ResponseEntity<Double> multiply(@RequestBody CalculatorDto CalculatorDto){
        Double result = null;
        result = CalculatorDto.getNum1() * CalculatorDto.getNum2() * CalculatorDto.getNum3() * CalculatorDto.getNum4();
        ResponseEntity<Double> responseEntity = new ResponseEntity<Double>(result, HttpStatus.CREATED);
        return responseEntity;
    }

    @GetMapping("/add2")
    public Double add2(@RequestParam("num11") Double num1, @RequestParam("num22") Double num2)
    {
        return propertyServiceimpl.add(num1,num2);
    }
}
