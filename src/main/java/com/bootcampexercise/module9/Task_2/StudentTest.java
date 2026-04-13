package com.bootcampexercise.module9.Task_2;

import com.bootcampexercise.module8.Task_4.Student;
import com.bootcampexercise.module8.Task_4.StudentArrayList;
import org.junit.Test; //importing all junit libraries and dependencies

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    private ArrayList<Student> createSampleList() { //Creates a sample list using the module 8 methods
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Yusuf", 91.0));
        students.add(new Student(2, "Mehmet", 70.0));
        students.add(new Student(3, "Abdulrezzak", 58.1));
        return students;
    }

    @Test // 1. Test adding student successfully
    public void testAddStudent() {
        ArrayList<Student> students = new ArrayList<>();
        Student newStudent = new Student(1, "Yusuf", 91.0);

        StudentArrayList.addStudent(students, newStudent);

        assertEquals(1, students.size());
    }

    @Test // 2. Test duplicate ID prevention
    public void testDuplicateStudentNotAdded() {
        ArrayList<Student> students = new ArrayList<>();
        Student s1 = new Student(1, "Yusuf", 91.0);
        Student s2 = new Student(1, "Abdulrezzak", 58.1);

        StudentArrayList.addStudent(students, s1);
        StudentArrayList.addStudent(students, s2);

        assertEquals(1, students.size());
    }

    @Test // 3. Test removal by ID
    public void testRemoveStudentById() {
        ArrayList<Student> students = createSampleList();

        students.removeIf(s -> s.getId() == 2);

        assertEquals(2, students.size());
    }

    @Test // 4. Test highest grade logic
    public void testHighestGradeStudent() {
        ArrayList<Student> students = createSampleList();

        Student top = null;
        for (Student s : students) {
            if (top == null || s.getGrade() > top.getGrade()) {
                top = s;
            }
        }

        assertEquals("Yusuf", top.getName());
    }

    @Test // 5. Test student exists in list
    public void testStudentExists() {
        ArrayList<Student> students = createSampleList();

        boolean exists = students.stream()
                .anyMatch(s -> s.getName().equals("Yusuf"));

        assertTrue(exists);
    }

    @Test // 6. Test list not empty after setup
    public void testListNotEmpty() {
        ArrayList<Student> students = createSampleList();
        assertFalse(students.isEmpty());
    }
}