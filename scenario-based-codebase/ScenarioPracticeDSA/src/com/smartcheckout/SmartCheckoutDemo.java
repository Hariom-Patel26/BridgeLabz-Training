package com.smartcheckout;

import java.util.HashMap;
import java.util.Map;

public class SmartCheckoutDemo {
    public static void main(String[] args) {

        Map<String, Item> inventory = new HashMap<>();
        inventory.put("1001", new Item("Milk 1L", 68.0, 50));
        inventory.put("1002", new Item("Bread", 45.0, 80));
        inventory.put("1003", new Item("Eggs 12pcs", 95.0, 40));
        inventory.put("1004", new Item("Rice 5kg", 320.0, 25));

        // Create counters
        CheckoutCounter counter1 = new CheckoutCounter("C1", inventory);
        CheckoutCounter counter2 = new CheckoutCounter("C2", inventory);

        Customer c1 = new Customer("CUST001", "Amit Sharma");
        c1.addToCart(inventory.get("1001"), 2);
        c1.addToCart(inventory.get("1002"), 1);
        c1.addToCart(inventory.get("1003"), 3);

        Customer c2 = new Customer("CUST002", "Priya Singh");
        c2.addToCart(inventory.get("1004"), 1);
        c2.addToCart(inventory.get("1001"), 1);

        Customer c3 = new Customer("CUST003", "Rahul Verma");
        c3.addToCart(inventory.get("1002"), 2);
        c3.addToCart(inventory.get("1003"), 6);


        counter1.addCustomer(c1);
        counter1.addCustomer(c3);
        counter2.addCustomer(c2);


        counter1.showQueueStatus();
        counter2.showQueueStatus();

        System.out.println("\n===== Start Billing Process =====\n");


        counter1.serveNextCustomer();
        counter2.serveNextCustomer();
        counter1.serveNextCustomer();

        System.out.println("\n===== Final Stock Status =====\n");
        for (Item item : inventory.values()) {
            System.out.println(item);
        }
    }
}