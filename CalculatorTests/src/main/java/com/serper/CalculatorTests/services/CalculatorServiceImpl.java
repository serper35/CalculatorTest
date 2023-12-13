package com.serper.CalculatorTests.services;

import com.serper.CalculatorTests.exceptions.DivideByZeroException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public float sum(float num1, float num2) {
        return num1 + num2;
    }

    @Override
    public float minus(float num1, float num2) {
        return num1 - num2 ;
    }

    @Override
    public float multiply(float num1, float num2) {
        return num1 * num2;
    }

    @Override
    public float divide(float num1, float num2) {
        if(num2 == 0){
            throw new DivideByZeroException("На ноль делить нельзя");
        }
        return num1 / num2;
    }
}
