package com.bootcampexercise.module10.Task_2;

import com.bootcampexercise.module10.Task_1.Person;

public class Student extends Person {
    private String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String introduce() {
        return "I study in university " + schoolName;
    }
}