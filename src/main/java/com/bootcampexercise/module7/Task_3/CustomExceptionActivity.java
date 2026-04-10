package com.bootcampexercise.module7.Task_3;

public class CustomExceptionActivity extends Exception { //extends the Exception class

    @Override
    public String getMessage() { //overrides getMessage() method
        return "You are not allowed to use this program";
    }
}