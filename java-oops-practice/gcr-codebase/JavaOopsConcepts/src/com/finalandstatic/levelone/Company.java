package com.finalandstatic.levelone;

public class Company {
    // Attributes
    private static String companyName = "XYZ Organization";
    private String name;
    private final int id;
    private String designation;
    private static int totalEmployees = 0;
    // Constructor
    public Company(String name, int id, String designation) {
        // Resolving ambiguity using this keyword
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }
    // Method to return total number of employees
    public static int displayTotalEmployees() {
        return totalEmployees;
    }
    // Display method
    public void displayDetails() {
        if(this instanceof Company) {
            System.out.println("Name: " + name);
            System.out.println("Id: " + id);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("Invalid employee object.");
        }
    }
    // Main method
    public static void main(String[] args) {
        // Display company name
        System.out.println("Company Name: " + companyName);
        // Create class objects
        Company emp1 = new Company("Adarsh Patel", 265956, "Software Engineer");
        Company emp2 = new Company("Uday Raj", 646154, "System Architect");
        // Call the display method
        emp1.displayDetails();
        emp2.displayDetails();
        // Display the total number of employee in the company
        System.out.println("Total Employees in the Company: " + displayTotalEmployees());
    }
}