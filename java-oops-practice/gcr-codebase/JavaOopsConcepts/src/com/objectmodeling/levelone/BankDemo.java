package com.objectmodeling.levelone;

public class BankDemo {
    public static void main(String[] args) {

        Bank sbi = new Bank("SBI Bank");

        Customer Sumit = new Customer("Sumit");
        Customer Sherya = new Customer("Sherya");

        sbi.openAccount(Sumit, 5000);
        sbi.openAccount(Sherya, 3000);

        Sumit.viewBalance();
        Sherya.viewBalance();
    }
}