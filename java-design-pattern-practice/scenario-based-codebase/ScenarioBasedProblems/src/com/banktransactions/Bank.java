package com.banktransactions;
import java.util.HashMap;
import java.util.Map;

public class Bank {

    // Stores accountNumber -> balance
    private Map<Integer, Integer> accounts = new HashMap<>();

    // Create account with initial balance
    public synchronized void addAccount(int accountNumber, int initialBalance) {
        accounts.put(accountNumber, initialBalance);
        System.out.println("Account Created: " + accountNumber + " Balance: " + initialBalance);
    }

    // Deposit money 
    public synchronized void deposit(int accountNumber, int amount) {
        int balance = accounts.get(accountNumber);
        balance += amount;
        accounts.put(accountNumber, balance);

        System.out.println(Thread.currentThread().getName() +
                " Deposited " + amount + " | Account: " + accountNumber +
                " | Balance: " + balance);
    }

    // Withdraw money 
    public synchronized void withdraw(int accountNumber, int amount) {
        int balance = accounts.get(accountNumber);

        if (balance >= amount) {
            balance -= amount;
            accounts.put(accountNumber, balance);

            System.out.println(Thread.currentThread().getName() +
                    " Withdraw " + amount + " | Account: " + accountNumber +
                    " | Balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() +
                    " Insufficient Balance | Account: " + accountNumber +
                    " | Balance: " + balance);
        }
    }

    // Get balance
    public synchronized int getBalance(int accountNumber) {
        return accounts.get(accountNumber);
    }
}
