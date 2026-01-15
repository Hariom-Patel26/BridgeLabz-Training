package com.smartcheckout;

public class Item {
    private String name;
    private double price;
    private int stock;

    public Item(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void reduceStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
        } else {
            throw new IllegalArgumentException("Not enough stock for item: " + name);
        }
    }

    @Override
    public String toString() {
        return String.format("%-20s ₹%-8.2f Stock: %d", name, price, stock);
    }
}