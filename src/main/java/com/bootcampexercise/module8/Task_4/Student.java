package com.bootcampexercise.module8.Task_4;

public class Student {

    private int id; //student attributes
    private String name;
    private double grade;

    public Student(int id, String name, double grade) {//student constructor
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() { //ID getter
        return id;
    }

    public void setId(int id) {// ID setter
        this.id = id;
    }

    public String getName() {//Name getter
        return name;
    }

    public void setName(String name) {//Name setter
        this.name = name;
    }

    public double getGrade() {//Grade getter
        return grade;
    }

    public void setGrade(double grade) {//Grade setter
        this.grade = grade;
    }

    public void printStudent() {
        System.out.println("ID: " + id + ", Name: " + name + ", Grade: " + grade);//prints the student details
    }
}