package com.smartcheckout;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Map;

public class CheckoutCounter {
    private String counterId;
    private Queue<Customer> customerQueue;
    private Map<String, Item> inventory; 

    public CheckoutCounter(String counterId, Map<String, Item> inventory) {
        this.counterId = counterId;
        this.customerQueue = new LinkedList<>();
        this.inventory = inventory;
    }

    public String getCounterId() {
        return counterId;
    }

    // Add customer to queue
    public void addCustomer(Customer customer) {
        customerQueue.offer(customer);
        System.out.println("Added to counter " + counterId + " → " + customer);
    }

    // Remove/Serve next customer
    public Customer serveNextCustomer() {
        if (customerQueue.isEmpty()) {
            System.out.println("Counter " + counterId + " → No customers in queue");
            return null;
        }

        Customer customer = customerQueue.poll();
        System.out.println("Now serving at counter " + counterId + " → " + customer);

        processPurchase(customer);
        return customer;
    }

    private void processPurchase(Customer customer) {
        double total = 0;
        System.out.println("\n--- Bill for " + customer.getName() + " ---");

        for (CartItem cartItem : customer.getCart()) {
            Item item = cartItem.getItem();
            int qty = cartItem.getQuantity();

            try {
                item.reduceStock(qty);
                double subtotal = cartItem.getSubTotal();
                total += subtotal;

                System.out.printf("%-20s x%-3d  ₹%8.2f%n",
                        item.getName(), qty, subtotal);

            } catch (IllegalArgumentException e) {
                System.out.println("ERROR: " + e.getMessage() + " - Skipping item");
            }
        }

        System.out.println("-----------------------------");
        System.out.printf("Total Amount:          ₹%8.2f%n", total);
        System.out.println("Thank you for shopping!\n");
    }

    public boolean isEmpty() {
        return customerQueue.isEmpty();
    }

    public int getQueueSize() {
        return customerQueue.size();
    }

    public void showQueueStatus() {
        System.out.println("Counter " + counterId + " queue (" + customerQueue.size() + " customers):");
        if (customerQueue.isEmpty()) {
            System.out.println("   (empty)");
        } else {
            int pos = 1;
            for (Customer c : customerQueue) {
                System.out.printf("   %d. %s%n", pos++, c);
            }
        }
    }
}