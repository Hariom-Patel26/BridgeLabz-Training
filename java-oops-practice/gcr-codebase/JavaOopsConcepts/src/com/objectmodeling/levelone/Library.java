package com.objectmodeling.levelone;

import java.util.ArrayList;

public class Library {

	// declaring instance variables
    String libraryName;
    ArrayList<Book> books;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        books = new ArrayList<>();
    }
    // setter method
    public void addBook(Book book) {
        books.add(book);
    }
    // display book details
    public void showBooks() {
        System.out.println("Books in " + libraryName + ":");
        for (Book book : books) {
            book.displayBook();
        }
    }
    
}