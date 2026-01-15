package com.payexpressapp;
import java.time.LocalDate;

class ElectricityBill extends Bill {

    public ElectricityBill(double amount, LocalDate dueDate) {
        super("Electricity", amount, dueDate);
    }

    public void sendReminder() {
    	if (!isPaid()) {
        System.out.println("Electricity bill due. Avoid power cut!");
    	}
    }
}
