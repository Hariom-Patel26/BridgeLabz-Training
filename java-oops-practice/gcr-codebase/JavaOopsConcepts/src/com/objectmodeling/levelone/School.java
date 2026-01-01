package com.objectmodeling.levelone;

import java.util.ArrayList;

public class School {

    String schoolName;
    ArrayList<Student> students = new ArrayList<>();

    // constructor of school class
    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    // method to add students
    public void addStudent(Student student) {
        students.add(student);
    }	
}