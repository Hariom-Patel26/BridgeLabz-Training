package com.icecreamrush;

public class IceCreamFlavor {
    String name;
    int sales;   
    public IceCreamFlavor(String name, int sales) {
        this.name = name;
        this.sales = sales;
    }

    @Override
    public String toString() {
        return name + " (Sold: " + sales + ")";
    }
}