package com.bootcampexercise.module10.Task_6;

public class InterfaceActivityClass {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.start();
        bike.stop();

        System.out.println();

        Car car = new Car();
        car.start();
        car.stop();
    }
}