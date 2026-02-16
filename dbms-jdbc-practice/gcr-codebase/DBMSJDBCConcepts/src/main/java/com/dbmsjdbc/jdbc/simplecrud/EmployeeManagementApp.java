package com.dbmsjdbc.jdbc.simplecrud;

import java.util.Scanner;

public class EmployeeManagementApp {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        EmployeeDAO dao = new EmployeeDAO();

        while (true) {

            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Update Salary");
            System.out.println("4. Delete Employee");
            System.out.println("5. Search Employee by Name");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = kb.nextInt();

            switch (choice) {

                case 1:
                    kb.nextLine();
                    System.out.print("Enter Name: ");
                    String name = kb.nextLine();

                    System.out.print("Enter Department: ");
                    String dept = kb.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = kb.nextDouble();

                    dao.addEmployee(new Employee(name, dept, salary));
                    break;

                case 2:
                    dao.viewAllEmployees();
                    break;

                case 3:
                    System.out.print("Enter Employee ID: ");
                    int id = kb.nextInt();

                    System.out.print("Enter New Salary: ");
                    double newSalary = kb.nextDouble();

                    dao.updateSalary(id, newSalary);
                    break;

                case 4:
                    System.out.print("Enter Employee ID: ");
                    int deleteId = kb.nextInt();
                    dao.deleteEmployee(deleteId);
                    break;

                case 5:
                    kb.nextLine();
                    System.out.print("Enter Name to Search: ");
                    String searchName = kb.nextLine();
                    dao.searchEmployeeByName(searchName);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
