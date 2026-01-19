package com.icecreamrush;

public class IceCreamSorter {

    public static void bubbleSort(IceCreamFlavor[] flavors) {
        int n = flavors.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (flavors[j].sales < flavors[j + 1].sales) {
                    // swap to sort by popularity (descending)
                    IceCreamFlavor temp = flavors[j];
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = temp;
                }
            }
        }
    }
}