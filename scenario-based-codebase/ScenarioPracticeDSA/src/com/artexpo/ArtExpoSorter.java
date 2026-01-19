package com.artexpo;

public class ArtExpoSorter {

    public static void insertionSort(Artist[] artists) {
        int n = artists.length;

        for (int i = 1; i < n; i++) {
            Artist key = artists[i];
            int j = i - 1;

            // Shift artists with later registration time
            while (j >= 0 && artists[j].registrationTime > key.registrationTime) {
                artists[j + 1] = artists[j];
                j--;
            }

            artists[j + 1] = key;
        }
    }
}