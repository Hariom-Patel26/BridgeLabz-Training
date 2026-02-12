package com.banktransactions;
public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank();

        // Create accounts
        bank.addAccount(101, 5000);
        bank.addAccount(102, 3000);

        // Create customers (threads)
        Customer c1 = new Customer(1, 101, bank);
        Customer c2 = new Customer(2, 101, bank);
        Customer c3 = new Customer(3, 102, bank);
        Customer c4 = new Customer(4, 102, bank);

        // Start threads
        c1.start();
        c2.start();
        c3.start();
        c4.start();

        // Wait for all threads to finish
        try {
            c1.join();
            c2.join();
            c3.join();
            c4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Final balances
        System.out.println("\nFinal Balance Account 101: " + bank.getBalance(101));
        System.out.println("Final Balance Account 102: " + bank.getBalance(102));
    }
}
