package com.timgarrick.test;

import com.timgarrick.main.Calculator;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void createCalculatorClassInstance(){
        calculator = new Calculator();
    }

    @DisplayName("Multiplication test for calculator class")
    @Test
    void testMultiply() {
        assertEquals(9, calculator.multiply(3,3),
                "Regular multiplication should work");
    }

    @Test
    @DisplayName("Addition test for calculator class")
    void testAddition() {
        assertEquals(10, calculator.add(2,8),
                "Regular addition should work");
    }

    @Test
    @DisplayName("Subtraction test using calculator class")
    void testSubtraction() {
        assertEquals(0, calculator.subtract(10,10),
                "Subtraction of 10 from 10");
    }

    @Test
    @DisplayName("Division test using calculator class")
    void testDivision() {
        assertEquals(5, calculator.divide(25,5),
                "Division of 25 by 5");
    }

/*    @Test
    @DisplayName("Non integer parameters")
    void testAdditionUsingNonIntegerParameters() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> calculator.add("x",2.5));
        assertEquals("Please enter 2 integers", exception.getMessage());
    }*/


    @Test
    @DisplayName("Addition using a negative number")
    void testAdditionWithNegativeNumbers() {
        assertEquals(-8, calculator.add(2,-10),
                "Tested using negative number");
        assertEquals(-20, calculator.add(-30,10),
                "Tested using negative number");
    }



   @RepeatedTest(5)
    @DisplayName("Ensure correct handling of zero")
    void testMultiplyWithZero() {
        assertEquals(0, calculator.multiply(0, 5), "Multiple with zero should be zero");
        assertEquals(0, calculator.multiply(5, 0), "Multiple with zero should be zero");
    }

}
