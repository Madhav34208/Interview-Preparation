package com.luv4code.functionals;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeClient {
    static List<Employee> employees = EmployeeDatabase.employeeList();

    public static void main(String[] args) {
//        countMaleAndFemaleEmployees();
//        printDepartments();
//        groupEmpsByCity();
//        groupEmpsByAge();
//        findEmpsAgeGraterThan30();
//        findMaxAgeOfEmployee();
//        findAvgAgeOnGender();
//        printNoOfEmpsInDept();
//        findDeptHavingMostNoOfEmps();
//        findAvgSalByDept();
//        findSecondHighestSalary();
//        printAveAndTotalSal();
        findHighestSalary();
    }

    //find highest salary in organization
    private static void findHighestSalary() {
        double highestSalary = employees.stream().mapToDouble(Employee::getSalary).distinct().max().orElse(0.0);
        System.out.println(highestSalary);
    }

    //print average and total salary in organization
    private static void printAveAndTotalSal() {
        Double totalSalary = employees.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println(totalSalary);

        double averageSalary = employees.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
        System.out.println(averageSalary);
    }

    //find second highest salary in organization
    private static void findSecondHighestSalary() {
        Double salary = employees.stream().map(Employee::getSalary).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0.0);
        System.out.println("second highest salary: "+salary);
    }

    //find average salary of each department
    public static void findAvgSalByDept(){
        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)))
                .forEach((k,v) -> System.out.println(k+" -> "+v));
    }

    //find the department with the highest no of employees
    public static void findDeptHavingMostNoOfEmps(){
        Map.Entry<String, Long> map = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
                .entrySet().stream()
                .max(Comparator.comparing(entry -> entry.getValue()))
                .get();
        System.out.println(map.getKey()+" -> "+map.getValue());
    }

    //print count the No of Employees working in each department
    private static void printNoOfEmpsInDept() {
        employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()))
                .forEach((k,v) -> System.out.println(k+" -> "+v));
    }


    //print average age of male and female employees
    public static void findAvgAgeOnGender(){
        employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)))
                .forEach((k,v) -> System.out.println(k+" -> "+v));
    }

    //find max age of employee
    public static void findMaxAgeOfEmployee(){
        Employee employee = employees.stream()
                .max(Comparator.comparing(Employee::getAge))
                .orElse(new Employee("", "", "", "", 0,0));
        System.out.println(employee);
    }

    //print employees whose age is grater than 30
    public  static void findEmpsAgeGraterThan30(){
        employees.stream()
                .filter(emp -> emp.getAge() > 30)
                .forEach(System.out::println);
    }

    //groping employees by age
    public static void groupEmpsByAge(){
        employees.stream()
                .collect(Collectors.groupingBy(Employee::getAge))
                .forEach((k,v) -> System.out.println(k+" -> "+v));
    }
    //counting male and female employees
    public static void countMaleAndFemaleEmployees() {
        employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + " " + v));
    }

    //print name of all departments in organization
    public static void printDepartments() {
        employees.stream()
                .map(Employee::getDepartment)
                .distinct()
                .forEach(System.out::println);
    }

    //grouping employees by city
    public static void groupEmpsByCity() {
        employees.stream()
                .collect(Collectors.groupingBy(Employee::getCity))
                .forEach((k, v) -> System.out.println(k + " " + v));
    }

}
