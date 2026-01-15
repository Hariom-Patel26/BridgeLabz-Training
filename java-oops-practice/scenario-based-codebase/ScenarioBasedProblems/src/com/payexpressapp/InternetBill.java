package com.payexpressapp;
import java.time.LocalDate;

class InternetBill extends Bill {

    public InternetBill(double amount, LocalDate dueDate) {
        super("Internet", amount, dueDate);
    }

    public void sendReminder() {
    	if (!isPaid()) {
        System.out.println("Internet bill pending. Stay connected!");
    	}
    }
}
