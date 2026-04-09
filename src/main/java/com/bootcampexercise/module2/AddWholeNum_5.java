package com.bootcampexercise.module2;

public class AddWholeNum_5 {
    public static void main(String[] args) {
        int sum = 0; //initial value

        for (int i = 50; i <= 100; i++) { //starts from 50, increments 1 and adds it to sum, repeats until condition not satisfied anymore, at 101.
            sum += i;
        }

        System.out.println("Sum: " + sum); //print output
    }
}