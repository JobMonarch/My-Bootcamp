package com.bootcampexercise.module10.Task_4;

import com.bootcampexercise.module10.Task_2.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Yusuf", 30, "Software Engineer", "Google", 85000.00);
        Employee emp2 = new Employee("Bob", 35, "Product Manager", "Amazon", 9500.00);
        Employee emp3 = new Employee("Pearson", 28, "Data Analyst", "Microsoft", 7000.00);
        Employee emp4 = new Employee("Mia", 40, "DevOps Engineer", "Netflix", 11000.00);
        Employee emp5 = new Employee("Eve", 32, "UI Designer", "Apple", 8500.00);

        List<Employee> empList = new ArrayList<Employee>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);

        System.out.println("The employee with the highest salary is: " + Employee.getHighestPaidEmp(empList));
    }
}