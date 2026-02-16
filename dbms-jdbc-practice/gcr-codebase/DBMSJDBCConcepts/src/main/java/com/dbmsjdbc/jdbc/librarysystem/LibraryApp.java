package com.dbmsjdbc.jdbc.librarysystem;

import java.util.Scanner;

public class LibraryApp {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        LibraryDAO dao = new LibraryDAO();

        while (true) {

            System.out.println("\n===== Library System =====");
            System.out.println("1. View Books");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Search Books");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = kb.nextInt();

            switch (choice) {

                case 1:
                    dao.viewBooks();
                    break;

                case 2:
                    System.out.print("Enter Book ID: ");
                    int bookId = kb.nextInt();
                    System.out.print("Enter Student ID: ");
                    int studentId = kb.nextInt();
                    dao.borrowBook(bookId, studentId);
                    break;

                case 3:
                    System.out.print("Enter Record ID: ");
                    dao.returnBook(kb.nextInt());
                    break;

                case 4:
                    kb.nextLine();
                    System.out.print("Title: ");
                    String title = kb.nextLine();
                    System.out.print("Author: ");
                    String author = kb.nextLine();
                    System.out.print("Category: ");
                    String category = kb.nextLine();
                    dao.searchBooks(title, author, category);
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}
