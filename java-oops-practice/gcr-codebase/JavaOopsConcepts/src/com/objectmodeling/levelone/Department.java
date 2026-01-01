package com.objectmodeling.levelone;

import java.util.ArrayList;

public class Department {
	
    String departmentName;
    ArrayList<Employee> employees;

    // constructor of department
    public Department(String departmentName) {
        this.departmentName = departmentName;
        employees = new ArrayList<>();
    }

    // method to add employees
    public void addEmployee(String employeeName) {
        employees.add(new Employee(employeeName));
    }
}