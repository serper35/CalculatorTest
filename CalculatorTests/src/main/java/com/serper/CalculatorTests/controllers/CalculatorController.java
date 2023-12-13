package com.serper.CalculatorTests.controllers;

import com.serper.CalculatorTests.services.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private CalculatorService service;

    public CalculatorController(CalculatorService service) {
        this.service = service;
    }
@GetMapping
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(value = "num1") float num1,
                       @RequestParam(value = "num2") float num2) {
        float result = service.sum(num1,num2);
        return num1 + " + " +  num2 + " = " + result;
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(value = "num1", required = false) float num1,
                        @RequestParam(value = "num2", required = false) float num2) {
        float result = service.minus(num1,num2);;
        return num1 + " - " +  num2 + " = " + result;
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) float num1,
                           @RequestParam(value = "num2", required = false) float num2) {
        float result = service.multiply(num1,num2);
        return num1 + " * " +  num2 + " = " + result;
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(value = "num1", required = false) float num1,
                         @RequestParam(value = "num2", required = false) float num2) {
        float result = service.divide(num1,num2);
        return num1 + " / " +  num2 + " = " + result;
    }
}
