package com.serper.CalculatorTests.exceptions;

public class DivideByZeroException extends IllegalArgumentException{
    public DivideByZeroException(String s) {
        super(s);
    }
}
