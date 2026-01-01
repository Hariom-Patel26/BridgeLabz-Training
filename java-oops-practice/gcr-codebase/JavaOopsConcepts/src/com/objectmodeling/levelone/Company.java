package com.objectmodeling.levelone;

import java.util.ArrayList;

public class Company {
	
    String companyName;
    ArrayList<Department> departments;

    // constructor of company 
    public Company(String companyName) {
        this.companyName = companyName;
        departments = new ArrayList<>();
    }

    // setter method to add department
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // method to close company
    public void closeCompany() {
        departments.clear(); // deletes departments and employees
        System.out.println(companyName + " has been closed.");
    }
}