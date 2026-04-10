package com.bootcampexercise.module5.Task_2;

public class Rectangle extends Shape {

    private double length; //initializes the length variable default value
    private double width; //initializes the width value

    public void setLength(double length) { //length setter
        this.length = length;
    }

    public void setWidth(double width) { //width setter
        this.width = width;
    }

    public double calculateArea() { //calculates the area
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    } //calculates the perimeter
}