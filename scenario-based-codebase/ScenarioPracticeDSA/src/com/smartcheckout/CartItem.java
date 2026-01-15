package com.smartcheckout;

public class CartItem {
    private Item item;
    private int quantity;

    public CartItem(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getSubTotal() {
        return item.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return String.format("%-20s x%-3d  ₹%8.2f", 
                item.getName(), quantity, getSubTotal());
    }
}