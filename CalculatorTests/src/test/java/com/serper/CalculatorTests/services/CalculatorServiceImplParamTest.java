package com.serper.CalculatorTests.services;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplParamTest {

    CalculatorServiceImpl out = new CalculatorServiceImpl();

    @ParameterizedTest
    @CsvSource({
            "2, 3, 6",
            "0, 10, 0",
            "-5, 8, -40",
            "3, -10, -30",
            "-3, -13, 39"
    })
    void multiplyParamTest(float num1, float num2, float expected) {
        float actual = out.multiply(num1, num2);
        assertEquals(expected,actual);
    }

    @ParameterizedTest
    @CsvSource({
            "2, 3, 5",
            "0, 10, 10",
            "-5, 8, 3",
            "3, -10, -7",
            "-3, -13, -16"
    })
    void sumParamTest(float num1, float num2, float expected) {
        float actual = out.sum(num1, num2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "2, 3, -1",
            "0, 10, -10",
            "-5, 8, -13",
            "3, -10, 13",
            "-3, -13, 10"
    })
    void minusParamTest(float num1, float num2, float expected) {
        float actual = out.minus(num1, num2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "2, 1, 2",
            "0, 10, 0",
            "-5, 8, -0.625",
            "3, -10, -0.3",
            "-3, -12, 0.25"
    })
    void divideParamTest(float num1, float num2, float expected) {
        float actual = out.divide(num1, num2);
        assertEquals(expected, actual);
    }
}