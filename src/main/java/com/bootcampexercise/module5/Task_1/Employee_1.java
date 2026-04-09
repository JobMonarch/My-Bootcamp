package com.bootcampexercise.module5.Task_1;

public class Employee_1 extends Person_1 {
    // Attributes of child class
    private double salary;
    private String title;

    // Initialization of constructor
    public Employee_1() {
    }

    public Employee_1(String name, int age, String title, double salary) {
        super(name, age); // Parent person class is called
        this.title = title;
        this.salary = salary;
    }

    public double getSalary() { //salary getter
        return salary;
    }

    public void setSalary(double salary) { //salary setter
        this.salary = salary;
    }

    public String getTitle() { //title getter
        return title;
    }

    public void setTitle(String title) { //title setter
        this.title = title;
    }
}