package com.bootcampexercise.module3.Task_2;

public class Calculator {

    // Constant calculator type
    public static final String CALC_TYPE_BASIC = "Basic";

    private String calculatorType;

    // Constructor for the calculator type
    public Calculator(String type) {
        this.calculatorType = type;
    }

    // Gets the calculator type
    public String getCalculatorType() {
        return calculatorType;
    }

    // Adds two numbers for the sum
    public int add(int a, int b) {
        return a + b;
    }

    // Multiplies the array of numbers
    public int multiply(int[] numbers) {
        int result = 1;
        for (int num : numbers) {
            result *= num;
        }
        return result;
    }

    // Divides the two numbers
    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }

    // Subtracts the two numbers
    public int subtract(int a, int b) {
        return a - b;
    }
}