package com.bootcampexercise.module10.Task_2;

public class AbstractActivity {
    public static void main(String[] args) {
        Employee employee = new Employee("John", 30, "Software Engineer", "Google", 5000.00);
        System.out.println(employee.introduce());

        System.out.println();

        Student student = new Student();
        student.setName("Jane");
        student.setAge(20);
        student.setSchoolName("MIT");
        System.out.println(student.introduce());
    }
}