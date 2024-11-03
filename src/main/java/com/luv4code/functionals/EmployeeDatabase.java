package com.luv4code.functionals;

import java.util.Arrays;
import java.util.List;

public class EmployeeDatabase {
    public static List<Employee> employeeList() {
        List<Employee> employees = Arrays.asList(
                new Employee("Amit", "Bangalore", "Male", "IT", 27, 25000),
                new Employee("Madhav", "Chennai", "Male", "IT", 30, 22000),
                new Employee("Priya", "Delhi", "Female", "HR", 34, 30000),
                new Employee("Raj", "Bangalore", "Male", "Finance", 27, 30000),
                new Employee("Suman", "Mumbai", "Female", "IT", 31, 33000),
                new Employee("Kiran", "Delhi", "Male", "HR", 34, 35000)
        );
        return employees;
    }
}
