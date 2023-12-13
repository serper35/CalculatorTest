package com.serper.CalculatorTests.exceptions;

public class divideByZeroException extends IllegalArgumentException{
    public divideByZeroException(String s) {
        super(s);
    }
}
