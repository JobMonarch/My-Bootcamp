package com.bootcampexercise.module10.Task_3;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
    private Calculator calculator;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        calculator = new Calculator();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        calculator = null;
    }

    //Add tests (overloaded int version)

    public void testAddIntegers() {
        assertEquals(10, calculator.add(4, 6));
    }

    public void testAddIntegersNegative() {
        assertEquals(-1, calculator.add(-4, 3));
    }

    //Add tests (overloaded double version)

    public void testAddDoubles() {
        assertEquals(5.5, calculator.add(2.5, 3.0));
    }

    public void testAddDoublesNegative() {
        assertEquals(-1.5, calculator.add(-4.5, 3.0));
    }

    //Subtract tests

    public void testSubtract() {
        assertEquals(4, calculator.subtract(10, 6));
    }

    public void testSubtractNegativeResult() {
        assertEquals(-3, calculator.subtract(2, 5));
    }

    // Divide tests

    public void testDivide() {
        assertEquals(5.0, calculator.divide(10, 2));
    }

    public void testDivideByZero() {
        assertEquals(0.0, calculator.divide(10, 0));
    }

    // Multiply tests

    public void testMultiply() {
        assertEquals(12.0, calculator.multiply(3, 4));
    }

    public void testMultiplyNegativeInput() {
        assertEquals(0.0, calculator.multiply(-3, 4));
    }
}