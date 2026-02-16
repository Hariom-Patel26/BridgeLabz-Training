package com.dbmsjdbc.jdbc.simplecrud;

public class Employee {

    private int id;
    private String name;
    private String department;
    private double salary;

    // Constructor without ID (for insert)
    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Constructor with ID (for fetch)
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
}
