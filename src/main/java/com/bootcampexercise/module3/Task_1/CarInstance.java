package com.bootcampexercise.module3.Task_1;

public class CarInstance {
    public static void main(String[] args) {
        // Print only 1 car name
        Car car = new Car("Volkswagen", "Black", 1998); //initiates the car variable
        System.out.println("Car Name: " + car.name); //prints the car name


        System.out.println("Car Details: Name - " + car.name + ", Color - " + car.color + ", Model No - " + car.modelNo); //prints all car details
    }
}
