package com.objectmodeling.levelone;

public class LibraryDriver {

	// main method 
    public static void main(String[] args) {

    	// object of book
        Book book1 = new Book("Java Basics", "James Gosling");
        Book book2 = new Book("Rules of world", "Henry Brook");

        // object of library
        Library cityLibrary = new Library("City Library");
        Library collegeLibrary = new Library("College Library");

        // calling methods
        cityLibrary.addBook(book1);
        collegeLibrary.addBook(book1);  // Same book in another library
        collegeLibrary.addBook(book2);

        cityLibrary.showBooks();
        collegeLibrary.showBooks();
    }
    
}