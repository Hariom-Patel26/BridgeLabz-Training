package com.payexpressapp;
class User {

    private String name;
    private double balance;

    public User(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public String getName() {
    	return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deductBalance(double amount) {
        balance -= amount;
    }

    public void showBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
