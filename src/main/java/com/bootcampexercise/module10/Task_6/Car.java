package com.bootcampexercise.module10.Task_6;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting. *engine noises*");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping. *engine stalling noise*");
    }
}