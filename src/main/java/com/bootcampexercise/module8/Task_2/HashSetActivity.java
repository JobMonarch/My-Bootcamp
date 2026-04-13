package com.bootcampexercise.module8.Task_2;

import java.util.HashSet;

public class HashSetActivity {

    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>(); //creates the HashSet and later add 10 names

        names.add("Yusuf");
        names.add("Andrii");
        names.add("Bonita");
        names.add("Kale");
        names.add("Disha"); //name to be found
        names.add("Fenti");
        names.add("Max");
        names.add("Brooke");
        names.add("Katy");
        names.add("Neill");

        System.out.println("Initial Set:"); //prints the initial set
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("-----------------------------"); //empty line

        names.add("Katy");
        names.add("Disha");//adds duplicate values to the hashset

        System.out.println("After adding duplicates:"); //prints after adding duplicates
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("-----------------------------"); //empty line

        names.remove("Max"); //removes 2 values
        names.remove("Bonita");

        System.out.println("After removing elements:"); //prints after removal
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("-----------------------------"); //empty line

        if (names.contains("Disha")) { //finds the index of 'Disha'
            System.out.println("Disha is present in the HashSet.");
        } else {
            System.out.println("Disha is not present in the HashSet.");
        }
    }
}
