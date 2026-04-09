package com.bootcampexercise.module5.Task_2;

public class Circle extends Shape {

    private double radius = 3; //initializes the radius default value

    public double calculateArea() {
        return Math.PI * radius * radius;
    } //calculates the area

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    } //calculates the perimeter
}