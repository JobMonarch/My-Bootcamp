package com.bootcampexercise.module7.Task_2;

public class ArithmeticExceptionActivity {


    public static void main(String args[]) { //main method


        ArithmeticExceptionActivity obj = new ArithmeticExceptionActivity(); //create instance
        obj.catchMe(10, 0); //call with 10 and 0

        System.out.println("-----------------------------");

        obj.catchMe(10, 2); //call with 10 and 2
    }

    void catchMe(int num1, int num2) {

        try {
            int result = num1 / num2; //can cause ArithmeticException (division by zero is possible)
            System.out.println("Result: " + result);

        } catch (ArithmeticException a) {
            System.out.println("Exception caught: Cannot divide by zero!"); //handles exception

        } finally {
            System.out.println("Thank you for using this program."); //always executes in the end
        }
    }
}
