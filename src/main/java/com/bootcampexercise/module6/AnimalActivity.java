package com.bootcampexercise.module6;

public class AnimalActivity {
    public static void main(String arg[]) {

        Animal cat = new Cat(); //using the interface animal references
        Animal dog = new Dog();

        Mammal catMammal = new Mammal("Whiskers"); //animal is set to cat
        catMammal.setAnimal(cat);
        catMammal.animalIsSleeping();
        catMammal.animalIsSpeaking();

        System.out.println("-----------------------------");


        Mammal dogMammal = new Mammal("Rex"); //animal is set to dog
        dogMammal.setAnimal(dog);
        dogMammal.animalIsSleeping();
        dogMammal.animalIsSpeaking();
    }
}
