package com.bootcampexercise.module3.Task_2;

public class CalculatorClient {

    public static void main(String[] args) {

        // Starts the basic type calculator
        Calculator normalCalc = new Calculator(Calculator.CALC_TYPE_BASIC);

        System.out.println("Will use the " + normalCalc.getCalculatorType() + " calculator.");

        // Addition
        int result = normalCalc.add(4, 5);
        System.out.println("1) Add result is " + result);

        // Multiplication
        int[] mul = {5, 3, 2};
        result = normalCalc.multiply(mul);
        System.out.println("2) Multiplication result is " + result);

        // Division
        result = normalCalc.divide(20, 5);
        System.out.println("3) Divide result is " + result);

        // Subtraction
        result = normalCalc.subtract(100, 30);
        System.out.println("4) Subtract result is " + result);
    }
}