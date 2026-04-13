package com.bootcampexercise.module9.Task_1;

public class Person {
    //IMPORTANT INFO
    private int weight;   // in kg
    private float height; // in meters

    public int getWeight() {//Weight getter
        return weight;
    }

    public void setWeight(int weight) {//weight setter
        this.weight = weight;
    }

    public float getHeight() {//height getter
        return height;
    }

    public void setHeight(float height) {//height setter
        this.height = height;
    }

    // the main bmi method
    public String getBodyMassIndex(int weight, float height) {

        if (weight <= 0 || height <= 0) {//Checks for validity and return invalid if that's the case
            return "Invalid input: values must be greater than 0";
        }

        if (weight > 500 || height > 3) { // reasonable limits
            return "Invalid input: values exceed realistic limits";
        }

        double bmi = weight / (height * height);

        // BMI categories
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}