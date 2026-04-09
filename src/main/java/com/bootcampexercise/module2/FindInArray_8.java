package com.bootcampexercise.module2;

public class FindInArray_8 {
    public static void main(String[] args) {
        int[] numbers = {10, 405, 71, 8, 2, 50, 31, 78, 69, 1, 6, 43, 21, 99, 5, 8, 4, 77, 368, 0}; //array of 20 numbers

        int largest = numbers[0]; //initialize largest variable and assign it the numbers array first index

        for (int num : numbers) { //for num in numbers loop
            if (num > largest) { //checks every iteration of num and compares if bigger than largest variable
                largest = num; //if true enters and replaces num with largest, hence in the end biggest is found
            }
        }

        System.out.println("Largest number: " + largest); //prints the largest value found in the end of for loop
    }
}