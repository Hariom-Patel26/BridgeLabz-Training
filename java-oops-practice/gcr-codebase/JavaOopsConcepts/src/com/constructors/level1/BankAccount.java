package com.constructors.level1;

public class BankAccount {
	    public int accountNumber;
	    protected String accountHolder;
	    private double balance;

	    BankAccount(int accountNumber, String accountHolder, double balance) {
	        this.accountNumber = accountNumber;
	        this.accountHolder = accountHolder;
	        this.balance = balance;
	    }

	    // Public methods for balance
	    public double getBalance() {
	        return balance;
	    }

	    public void setBalance(double balance) {
	        this.balance = balance;
	    }
	}
