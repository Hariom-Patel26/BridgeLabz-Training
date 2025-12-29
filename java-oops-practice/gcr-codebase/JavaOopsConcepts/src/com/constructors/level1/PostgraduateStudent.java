package com.constructors.level1;
//Subclass
public class PostgraduateStudent extends Student{
	    PostgraduateStudent(int rollNumber, String name, double CGPA) {
	        super(rollNumber, name, CGPA);
	    }

	    void display() {
	        System.out.println("Roll Number: " + rollNumber); // public
	        System.out.println("Name: " + name);              // protected
	        System.out.println("CGPA: " + getCGPA());          // private via method
	    }

	    public static void main(String[] args) {
	        PostgraduateStudent pg = new PostgraduateStudent(101, "Amit", 8.5);
	        pg.display();
	    }
	}
