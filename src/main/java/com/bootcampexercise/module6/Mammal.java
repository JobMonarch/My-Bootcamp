package com.bootcampexercise.module6;

public class Mammal {

    private Animal myAnimal;
    private String name;

    public Mammal(String name) { //constructor for mammal
        this.name = name;
    }

    public void setAnimal(Animal animal) { //animal setter
        myAnimal = animal;
    }

    public void animalIsSleeping() {
        System.out.println("Animal with name: " + name + " is sleeping");
        myAnimal.sleep();
    }

    public void animalIsSpeaking() {
        System.out.println("Animal with name: " + name + " is awake");
        myAnimal.animalSound();
    }
}
