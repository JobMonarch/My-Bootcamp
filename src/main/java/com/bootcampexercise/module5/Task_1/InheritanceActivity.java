package com.bootcampexercise.module5.Task_1;

public class InheritanceActivity {
    public static void main(String[] args) {

        // Creates the person object p
        Person_1 myPerson = new Person_1();
        myPerson.setName("John Doediddle");
        myPerson.setAge(21);

        System.out.println("-----------------------------");

        // Creates the employee object e
        Employee_1 myEmployee = new Employee_1();
        myEmployee.setName("Shawn Mendez");
        myEmployee.setAge(32);
        myEmployee.setTitle("Construction Worker");
        myEmployee.setSalary(70000.00);

        // Prints the information using the employee object
        System.out.println("Employee Info:");
        System.out.println("Name: " + myEmployee.getName());
        System.out.println("Age: " + myEmployee.getAge());
        System.out.println("Title: " + myEmployee.getTitle());
        System.out.println("Salary: $" + myEmployee.getSalary());

        System.out.println("-----------------------------");

        // Prints the information using the person object
        System.out.println("Person Info:");
        System.out.println("Name: " + myPerson.getName());
        System.out.println("Age: " + myPerson.getAge());

        System.out.println("-----------------------------");
    }
}