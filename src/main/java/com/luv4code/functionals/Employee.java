package com.luv4code.functionals;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {
    private String name;
    private String city;
    private String gender;
    private String department;
    private int age;
    private double salary;
}
