package com.payexpressapp;
import java.time.LocalDate;

abstract class Bill implements IPayable {

    protected String type;
    protected double amount;
    protected LocalDate dueDate;
    private boolean isPaid;

    public Bill(String type, double amount, LocalDate dueDate) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

    public boolean isPaid() {
        return isPaid;
    }

    protected void markPaid() {
        this.isPaid = true;
    }

    @Override
    public void pay(User user) {
        if (isPaid) {
            System.out.println(type + " bill already paid.");
            return;
        }

        if (user.getBalance() >= amount) {
            user.deductBalance(amount);
            markPaid();
            System.out.println(type + " bill paid successfully.");
        } else {
            System.out.println("Insufficient balance to pay " + type + " bill.");
        }
    }
}
