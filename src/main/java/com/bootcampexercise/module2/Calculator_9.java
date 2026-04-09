package com.bootcampexercise.module2;

import java.util.Scanner; //import scanner library for user inputs

public class Calculator_9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //initialize scanner

        System.out.print("Enter first number: "); //first number input
        int a = scanner.nextInt();

        System.out.print("Enter second number: "); //second number input
        int b = scanner.nextInt();

        System.out.println("Sum: " + sum(a, b)); //result of sum
        System.out.println("Subtract: " + subtract(a, b)); //result of subtraction
        System.out.println("Multiply: " + multiply(a, b)); //result of multiplication
        System.out.println("Divide: " + divide(a, b)); //result of division
        System.out.println("Modulo: " + modulo(a, b)); //result of modulo

        scanner.close();
    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int divide(int x, int y) {
        if (y != 0) { //Checks for division by 0
            return x / y;
        } else {
            System.out.println("Cannot divide by zero");
            return 0;
        }
    }

    public static int modulo(int x, int y) {
        if (y != 0) { //checks for division by zero
            return x % y;
        } else {
            System.out.println("Cannot modulo by zero");
            return 0;
        }
    }
}