
package com.objectmodeling.levelone;

public class Book {
	// declaring variables
    String title;
    String author;

    // constructor of book
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // display book details
    public void displayBook() {
        System.out.println(title + " by " + author);
    }
}
