package com.constructors.level1;

public class SavingsAccount extends BankAccount {
	// Subclass

		    SavingsAccount(int accountNumber, String accountHolder, double balance) {
		        super(accountNumber, accountHolder, balance);
		    }

		    void display() {
		        System.out.println("Account Number: " + accountNumber); // public
		        System.out.println("Account Holder: " + accountHolder); // protected
		        System.out.println("Balance: " + getBalance());
		    }

		    public static void main(String[] args) {
		        SavingsAccount sa = new SavingsAccount(1001, "Rahul", 25000);
		        sa.display();
		    }
		}
