package com.bootcampexercise.module5.Task_2;

public class AbstractActivity {
    public static void main(String args[]) {

        Rectangle rectangle = new Rectangle(); //reaches the rectangle class

        rectangle.setColor("Red"); //color setter
        rectangle.setLength(10); //length setter
        rectangle.setWidth(5); //width setter

        System.out.println("Rectangle Color: " + rectangle.getColor()); //color getter and printer

        System.out.println("Rectangle Area: " + rectangle.calculateArea()); //area calculation

        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter()); //perimeter calculation


        System.out.println("-----------------------------"); //empty line for aesthetics


        Circle circle = new Circle(); //reaches the circle class

        circle.setColor("Blue"); //color setter
        circle.setRadius(5); //radius setter
        System.out.println("Circle Color: " + circle.getColor()); //color getter and printer

        System.out.println("Circle Area: " + circle.calculateArea()); //area calculation

        System.out.println("Circle Perimeter: " + circle.calculatePerimeter()); //perimeter calculation
    }
}
