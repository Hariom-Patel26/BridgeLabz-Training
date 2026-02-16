package com.dbmsjdbc.jdbc.librarysystem;

import java.sql.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LibraryDAO {

    //View All Books (Inventory)
    public void viewBooks() {

        String sql = "SELECT * FROM books";

        try (Connection con = DBConnection.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("book_id") + " | " +
                        rs.getString("title") + " | " +
                        rs.getString("author") + " | " +
                        rs.getString("category") + " | Qty: " +
                        rs.getInt("quantity")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Borrow Book
    public void borrowBook(int bookId, int studentId) {

        Connection con = null;

        try {
            con = DBConnection.getConnection();
            con.setAutoCommit(false);

            // Check book quantity
            PreparedStatement checkStmt =
                    con.prepareStatement("SELECT quantity FROM books WHERE book_id = ?");
            checkStmt.setInt(1, bookId);
            ResultSet rs = checkStmt.executeQuery();

            if (rs.next()) {
                int qty = rs.getInt("quantity");

                if (qty <= 0) {
                    System.out.println("Book not available!");
                    con.rollback();
                    return;
                }
            }

            // Reduce quantity
            PreparedStatement updateQty =
                    con.prepareStatement("UPDATE books SET quantity = quantity - 1 WHERE book_id = ?");
            updateQty.setInt(1, bookId);
            updateQty.executeUpdate();

            // Insert borrow record
            PreparedStatement insertRecord =
                    con.prepareStatement("INSERT INTO borrow_records (book_id, student_id, borrow_date) VALUES (?, ?, ?)");
            insertRecord.setInt(1, bookId);
            insertRecord.setInt(2, studentId);
            insertRecord.setDate(3, Date.valueOf(LocalDate.now()));
            insertRecord.executeUpdate();

            con.commit();
            System.out.println("Book Borrowed Successfully!");

        } catch (SQLException e) {
            try { if (con != null) con.rollback(); } catch (Exception ex) {}
            e.printStackTrace();
        }
    }

    //Return Book + Fine Calculation
    public void returnBook(int recordId) {

        String selectSQL = "SELECT borrow_date, book_id FROM borrow_records WHERE record_id = ?";

        try (Connection con = DBConnection.getConnection()) {

            PreparedStatement ps = con.prepareStatement(selectSQL);
            ps.setInt(1, recordId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                LocalDate borrowDate = rs.getDate("borrow_date").toLocalDate();
                LocalDate today = LocalDate.now();

                long days = ChronoUnit.DAYS.between(borrowDate, today);

                double fine = 0;

                if (days > 7) { 
                    fine = (days - 7) * 10; 
                }

                // Update return date & fine
                PreparedStatement updateRecord =
                        con.prepareStatement("UPDATE borrow_records SET return_date=?, fine=? WHERE record_id=?");
                updateRecord.setDate(1, Date.valueOf(today));
                updateRecord.setDouble(2, fine);
                updateRecord.setInt(3, recordId);
                updateRecord.executeUpdate();

                // Increase quantity
                PreparedStatement updateBook =
                        con.prepareStatement("UPDATE books SET quantity = quantity + 1 WHERE book_id=?");
                updateBook.setInt(1, rs.getInt("book_id"));
                updateBook.executeUpdate();

                System.out.println("Book Returned. Fine = ₹" + fine);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Search with Multiple Filters
    public void searchBooks(String title, String author, String category) {

        String sql = "SELECT * FROM books WHERE title LIKE ? AND author LIKE ? AND category LIKE ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, "%" + title + "%");
            ps.setString(2, "%" + author + "%");
            ps.setString(3, "%" + category + "%");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                        rs.getInt("book_id") + " | " +
                        rs.getString("title") + " | " +
                        rs.getString("author") + " | " +
                        rs.getString("category")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
