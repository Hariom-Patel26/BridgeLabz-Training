package com.constructors.level1;

public class EBook extends BookLog{
	// Subclass
	    EBook(String ISBN, String title, String author) {
	        super(ISBN, title, author);
	    }

	    void display() {
	        System.out.println("ISBN: " + ISBN);       // public
	        System.out.println("Title: " + title);     // protected
	        System.out.println("Author: " + getAuthor());
	    }

	    public static void main(String[] args) {
	        EBook eb = new EBook("123-XYZ", "Java Basics", "James");
	        eb.display();
	    }
	}
