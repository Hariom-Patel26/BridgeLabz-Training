package com.payexpressapp;
import java.time.LocalDate;

class WaterBill extends Bill {

    public WaterBill(double amount, LocalDate dueDate) {
        super("Water", amount, dueDate);
    }

    public void sendReminder() {
    	if (!isPaid()) {
        System.out.println("Water bill due. Pay on time!");
    	}
    }
}
