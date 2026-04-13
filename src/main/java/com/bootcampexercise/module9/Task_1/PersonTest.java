package com.bootcampexercise.module9.Task_1;

import junit.framework.TestCase; //imports the junit dependencies

public class PersonTest extends TestCase {

    private Person person;

    protected void setUp() { // setup class
        person = new Person();
    }

    protected void tearDown() { //teardown class called after test execution
        person = null;
    }

    public void testGettersAndSetters() { //test getters and setters
        person.setWeight(70);
        person.setHeight(1.75f);

        assertEquals(70, person.getWeight());
        assertEquals(1.75f, person.getHeight());
    }

    public void testBMI_Normal() {// Test BMI method for normal case
        String result = person.getBodyMassIndex(70, 1.75f);
        assertEquals("Normal", result);
    }

    public void testBMI_Underweight() {// Test BMI method for underweight case
        String result = person.getBodyMassIndex(50, 1.75f);
        assertEquals("Underweight", result);
    }

    public void testBMI_Invalid() { //Test BMI method for Invalid input case
        String result = person.getBodyMassIndex(0, 1.75f);
        assertTrue(result.contains("Invalid"));
    }
}