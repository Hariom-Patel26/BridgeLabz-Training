package com.constructors.level1;

public class EmployeeDriver extends Employee{
	// Subclass
	EmployeeDriver(int employeeID, String department, double salary) {
		        super(employeeID, department, salary);
		    }

		    void display() {
		        System.out.println("Employee ID: " + employeeID); // public
		        System.out.println("Department: " + department);  // protected
		        System.out.println("Salary: " + getSalary());
		    }

		    public static void main(String[] args) {
		    	EmployeeDriver m = new EmployeeDriver(501, "IT", 75000);
		        m.display();
		    }

}
