package com.constructors.level1;

public class BookLog {
	    public String ISBN;
	    protected String title;
	    private String author;

	    BookLog(String ISBN, String title, String author) {
	        this.ISBN = ISBN;
	        this.title = title;
	        this.author = author;
	    }

	    // Setter and Getter for author
	    public void setAuthor(String author) {
	        this.author = author;
	    }

	    public String getAuthor() {
	        return author;
	    }
	}