package com.bootcampexercise.module5.Task_1;

public class Person_1 {
    // Main parent class attributes
    private String name;
    private int age;

    // Initialize constructor
    public Person_1() {
    }

    public Person_1(String name, int age) { //constructor variables
        this.name = name;
        this.age = age;
    }

    public String getName() { //name getter
        return name;
    }

    public void setName(String name) { //name setter
        this.name = name;
    }

    public int getAge() { //age getter
        return age;
    }

    public void setAge(int age) { //age setter
        this.age = age;
    }
}