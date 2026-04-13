package com.bootcampexercise.module10.Task_3;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public double divide(double a, double b) {
        try {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Division error: " + e.getMessage());
            return 0;
        }
    }

    public double multiply(double a, double b) {
        try {
            if (a < 0 || b < 0) {
                throw new InvalidInputException("Negative numbers are not allowed in multiplication.");
            }
            return a * b;
        } catch (InvalidInputException e) {
            System.out.println("Multiplication error: " + e.getMessage());
            return 0;
        }
    }
}