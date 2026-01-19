package com.icecreamrush;

public class IceCreamRush {

    public static void main(String[] args) {

        IceCreamFlavor[] flavors = {
            new IceCreamFlavor("Vanilla", 120),
            new IceCreamFlavor("Chocolate", 200),
            new IceCreamFlavor("Strawberry", 90),
            new IceCreamFlavor("Mango", 150),
            new IceCreamFlavor("Butterscotch", 110),
            new IceCreamFlavor("Pista", 80),
            new IceCreamFlavor("Coffee", 130),
            new IceCreamFlavor("Black Current", 100)
        };

        System.out.println("Before Sorting:");
        for (IceCreamFlavor f : flavors) {
            System.out.println(f);
        }

        IceCreamSorter.bubbleSort(flavors);

        System.out.println("\nAfter Sorting (By Popularity):");
        for (IceCreamFlavor f : flavors) {
            System.out.println(f);
        }
    }
}