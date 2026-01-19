package com.smartlibrary;

public class SmartLibrary {

    public static void main(String[] args) {

        Book[] borrowedBooks = {
            new Book("Algorithms"),
            new Book("Data Structures"),
            new Book("Java Programming"),
            new Book("Operating Systems"),
            new Book("Computer Networks")
        };

        System.out.println("Before New Book Issued:");
        for (Book b : borrowedBooks) {
            System.out.println(b);
        }

        // New book issued (nearly sorted list)
        Book[] updatedList = new Book[borrowedBooks.length + 1];
        System.arraycopy(borrowedBooks, 0, updatedList, 0, borrowedBooks.length);
        updatedList[updatedList.length - 1] = new Book("Database Systems");

        LibrarySorter.insertionSort(updatedList);

        System.out.println("\nAfter Auto-Sorting:");
        for (Book b : updatedList) {
            System.out.println(b);
        }
    }
}