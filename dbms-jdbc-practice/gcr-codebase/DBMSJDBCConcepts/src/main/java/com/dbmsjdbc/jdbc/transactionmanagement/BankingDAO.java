package com.dbmsjdbc.jdbc.transactionmanagement;

import java.sql.*;

public class BankingDAO {

    //Check Balance
    public void checkBalance(int accountId) {

        String sql = "SELECT balance FROM accounts WHERE account_id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, accountId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Current Balance: " + rs.getDouble("balance"));
            } else {
                System.out.println("Account Not Found!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Transfer Money with TRANSACTION
    public void transferMoney(int fromAcc, int toAcc, double amount) {

        Connection con = null;

        try {
            con = DBConnection.getConnection();
            
            con.setAutoCommit(false);

            //Check balance
            PreparedStatement checkStmt =
                    con.prepareStatement("SELECT balance FROM accounts WHERE account_id = ?");
            checkStmt.setInt(1, fromAcc);
            ResultSet rs = checkStmt.executeQuery();

            if (rs.next()) {
                double balance = rs.getDouble("balance");

                if (balance < amount) {
                    System.out.println("Insufficient Balance!");
                    con.rollback();
                    return;
                }
            } else {
                System.out.println("From Account Not Found!");
                con.rollback();
                return;
            }

            //Debit
            PreparedStatement debitStmt =
                    con.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE account_id = ?");
            debitStmt.setDouble(1, amount);
            debitStmt.setInt(2, fromAcc);
            debitStmt.executeUpdate();

            // Credit
            PreparedStatement creditStmt =
                    con.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE account_id = ?");
            creditStmt.setDouble(1, amount);
            creditStmt.setInt(2, toAcc);
            creditStmt.executeUpdate();

            //Insert into history
            PreparedStatement historyStmt =
                    con.prepareStatement("INSERT INTO transactions (from_account, to_account, amount) VALUES (?, ?, ?)");
            historyStmt.setInt(1, fromAcc);
            historyStmt.setInt(2, toAcc);
            historyStmt.setDouble(3, amount);
            historyStmt.executeUpdate();

            // Commit
            con.commit();
            System.out.println("Transfer Successful!");

        } catch (SQLException e) {
            try {
                if (con != null)
                    con.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.setAutoCommit(true);
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //Transaction History
    public void transactionHistory(int accountId) {

        String sql = "SELECT * FROM transactions WHERE from_account = ? OR to_account = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, accountId);
            ps.setInt(2, accountId);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("Transaction ID: " + rs.getInt("transaction_id") +" | From: " + rs.getInt("from_account") +" | To: " + rs.getInt("to_account") +" | Amount: " + rs.getDouble("amount") +" | Date: " + rs.getTimestamp("transaction_date"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
