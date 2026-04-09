package com.bootcampexercise.module2;

public class PrintNumWithWhile_7 {
    public static void main(String[] args) {
        int i = 1; //initial value

        while (i < 100) { //loop starts from 1 and checks if less than 100
            if (i % 2 != 0) { //if the remainder of division by 2 is not zero, will enter in
                System.out.println(i); //prints the i if condition is satisfied
            }
            i++; //increments by 1 to continue while loop
        }
    }
}
