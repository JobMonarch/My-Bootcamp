package com.bootcampexercise.module10.Task_2;

import com.bootcampexercise.module10.Task_1.Person;
import java.util.List;

public class Employee extends Person {
    private String jobTitle;
    private String company;
    private double salary;

    public Employee() {}

    public Employee(String jobTitle, String company, double salary) {
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    public Employee(String name, int age, String jobTitle, String company, double salary) {
        setName(name);
        setAge(age);
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String introduce() {
        return "My name is " + getName() + " and i am " + getAge() + " years old\n" +
                "I work as a(n) " + jobTitle + " in " + company + " and my salary is " + salary;
    }

    public static String getHighestPaidEmp(List<Employee> empList) {
        Employee highest = empList.get(0);
        for (Employee emp : empList) {
            if (emp.getSalary() > highest.getSalary()) {
                highest = emp;
            }
        }
        return highest.getName();
    }
}