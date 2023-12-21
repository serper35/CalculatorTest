package com.serper.CalculatorTests.services;

import com.serper.CalculatorTests.exceptions.DivideByZeroException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {
    float num1 = 5;
    float num2 = 15;
    float num3 = 25;
    float num4 = 35;

    private CalculatorServiceImpl out = new CalculatorServiceImpl();


    @Test
    void testSumSimpleCase() {
        float actual = out.sum(num1, num2);
        float actual1 = out.sum(num3,num4);
        assertEquals(20, actual);
        assertEquals(60, actual1);
    }

    @Test
    void testMinusimpleCase() {
        float actual = out.minus(num1, num2);
        float actual1 = out.minus(num3,num4);
        assertEquals(-10, actual);
        assertEquals(-10, actual1);
    }

    @Test
    void testMultiplyimpleCase() {
        float actual = out.multiply(num1, num2);
        float actual1 = out.multiply(num3,num4);
        assertEquals(75, actual);
        assertEquals(875, actual1);
    }

    @Test
    void testDivideSimpleCase() {
        float actual = out.divide(num2, num1);
        float actual1 = out.divide(num3,num1);
        assertEquals(3.0, actual);
        assertEquals(5.0, actual1);
    }

    @Test
    void testDivideByZeroThrowException() {
        assertThrows(DivideByZeroException.class, () -> {
            out.divide((10), 0);
        });
    }
}