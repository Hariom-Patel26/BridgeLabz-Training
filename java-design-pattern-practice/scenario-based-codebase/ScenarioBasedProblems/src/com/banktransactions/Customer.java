package com.banktransactions;
public class Customer extends Thread {

    private int customerId;
    private int accountNumber;
    private Bank bank;

    public Customer(int customerId, int accountNumber, Bank bank) {
        this.customerId = customerId;
        this.accountNumber = accountNumber;
        this.bank = bank;
        setName("Customer-" + customerId);
    }

    @Override
    public void run() {
        bank.deposit(accountNumber, 1000);
        bank.withdraw(accountNumber, 500);
        bank.deposit(accountNumber, 700);
        bank.withdraw(accountNumber, 300);
    }
}
