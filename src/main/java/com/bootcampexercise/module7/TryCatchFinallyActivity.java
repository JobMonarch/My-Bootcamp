package com.bootcampexercise.module7;

public class TryCatchFinallyActivity {

    public static void main(String[] args) {

        TryCatchFinallyActivity obj = new TryCatchFinallyActivity(); //initializes and calls the methods
        obj.catchMeIfYouCan();
    }

    void catchMeIfYouCan() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; //the given array

        try {

            for (int i = 0; i <= 10; i++) { //incorrect condition on purpose (i <= 10)
                System.out.println("Value: " + arr[i]);
            }

        } catch (IndexOutOfBoundsException e) {

            System.out.println("Exception caught: Array index is out of bounds!"); //custom message

        } finally {

            System.out.println("Finally block executed. This runs no matter what."); //will always execute
        }
    }
}