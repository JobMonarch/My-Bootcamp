package com.bootcampexercise.module5.Task_2;

public abstract class Shape {
    public String color; //creates the color variable as string

    public Shape() { //starts the shape constructor
    }

    public abstract double calculateArea(); //area calculation abstract method
    public abstract double calculatePerimeter(); //perimeter calculation abstract method

    public void setColor(String c) {
        color = c;
    } //color setter

    public String getColor() { //color getter
        return color;
    }
}