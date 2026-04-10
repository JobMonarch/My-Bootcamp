package com.bootcampexercise.module6;

public class AnimalActivity {
    public static void main(String arg[]) {

        // Use interface references
        Animal cat = new Cat();
        Animal dog = new Dog();

        // Set animal to cat
        Mammal catMammal = new Mammal("Whiskers");
        catMammal.setAnimal(cat);
        catMammal.animalIsSleeping();
        catMammal.animalIsSpeaking();

        System.out.println("-----------------------------");

        // Set animal to dog
        Mammal dogMammal = new Mammal("Rex");
        dogMammal.setAnimal(dog);
        dogMammal.animalIsSleeping();
        dogMammal.animalIsSpeaking();
    }
}
