package com.bootcampexercise.module8.Task_4;

import java.util.ArrayList;

public class StudentArrayList {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        //adds the students using the addStudent method below
        addStudent(students, new Student(1, "Kate", 80.5));
        addStudent(students, new Student(2, "Michael", 88.0));
        addStudent(students, new Student(3, "Bob", 91.6));
        addStudent(students, new Student(4, "Pringles", 98.3));

        System.out.println("All Students:"); //prints all the students
        printStudents(students);

        students.removeIf(s -> s.getId() == 3); //removes the student with ID = 3

        System.out.println("\nAll students after removing ID 3:"); //prints after removal of ID = 3
        printStudents(students);

        //finds the highest grade student
        Student topStudent = null;
        for (Student s : students) {
            if (topStudent == null || s.getGrade() > topStudent.getGrade()) {
                topStudent = s;
            }
        }

        if (topStudent != null) { //checks if the top grade student even exists first
            System.out.println("\nHighest Grade Student:");
            topStudent.printStudent();
        }
    }

    public static void addStudent(ArrayList<Student> students, Student newStudent) {
        for (Student s : students) { //adds student which prevents duplicate ID
            if (s.getId() == newStudent.getId()) {
                System.out.println("Student with ID " + newStudent.getId() + " already exists.");
                return;
            }
        }
        students.add(newStudent);
    }

    public static void printStudents(ArrayList<Student> students) { //prints all the students
        for (Student s : students) {
            s.printStudent();
        }
    }
}