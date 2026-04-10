package com.bootcampexercise.module5.Task_2;

public class Circle extends Shape {

    private double radius; //initializes the radius

    public void setRadius(double radius) { //radius setter
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    } //calculates the area

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    } //calculates the perimeter
}