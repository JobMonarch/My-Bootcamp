package com.bootcampexercise.module10.Task_6;

public class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Motorbike is starting. *Loud engine revving noise*");
    }

    @Override
    public void stop() {
        System.out.println("Motorbike is stopping. *Engine slowly stalls*");
    }
}