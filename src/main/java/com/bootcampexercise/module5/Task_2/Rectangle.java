package com.bootcampexercise.module5.Task_2;

public class Rectangle extends Shape {

    private double length = 7; //initializes the length variable default value
    private double width = 2; //initializes the width value

    public double calculateArea() { //calculates the area
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    } //calculates the perimeter
}