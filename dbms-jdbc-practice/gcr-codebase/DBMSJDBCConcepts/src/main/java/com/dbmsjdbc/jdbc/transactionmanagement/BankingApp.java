package com.dbmsjdbc.jdbc.transactionmanagement;

import java.util.Scanner;

public class BankingApp {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        BankingDAO dao = new BankingDAO();

        while (true) {

            System.out.println("\n===== Banking System =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Transfer Money");
            System.out.println("3. Transaction History");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = kb.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Account ID: ");
                    dao.checkBalance(kb.nextInt());
                    break;

                case 2:
                    System.out.print("From Account ID: ");
                    int from = kb.nextInt();

                    System.out.print("To Account ID: ");
                    int to = kb.nextInt();

                    System.out.print("Amount: ");
                    double amount = kb.nextDouble();

                    dao.transferMoney(from, to, amount);
                    break;

                case 3:
                    System.out.print("Enter Account ID: ");
                    dao.transactionHistory(kb.nextInt());
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}
