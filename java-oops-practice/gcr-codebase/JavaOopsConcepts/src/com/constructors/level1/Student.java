package com.constructors.level1;

public class Student {
	    public int rollNumber;
	    protected String name;
	    private double CGPA;

	    // Constructor
	    Student(int rollNumber, String name, double CGPA) {
	        this.rollNumber = rollNumber;
	        this.name = name;
	        this.CGPA = CGPA;
	    }

	    // Public methods to access and modify CGPA
	    public double getCGPA() {
	        return CGPA;
	    }

	    public void setCGPA(double CGPA) {
	        this.CGPA = CGPA;
	    }
	}
	
