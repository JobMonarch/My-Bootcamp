package com.bootcampexercise.module2;

public class MultiplicationTable_6 {
    public static void main(String[] args) {

        for (int i = 11; i <= 20; i++) { //starts from 11 until 20, included
            System.out.println("Table of " + i + ":"); //prints the title of each table, such as table of 13 multiplications etc..

            for (int j = 1; j <= 10; j++) { //the actual tables are created here
                System.out.println(i + " x " + j + " = " + (i * j)); // nested loop, where i and j are our multiplication table numbers
            }

            System.out.println(); //after every table, inserts empty line
        }
    }
}