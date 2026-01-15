package com.smartcheckout;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerId;
    private String name;
    private List<CartItem> cart;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.cart = new ArrayList<>();
    }

    public void addToCart(Item item, int quantity) {
        cart.add(new CartItem(item, quantity));
    }

    public List<CartItem> getCart() {
        return cart;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public double calculateTotalBill() {
        double total = 0;
        for (CartItem item : cart) {
            total += item.getSubTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        return String.format("Customer: %s (%s) | Items: %d | Total: ₹%.2f",
                name, customerId, cart.size(), calculateTotalBill());
    }
}