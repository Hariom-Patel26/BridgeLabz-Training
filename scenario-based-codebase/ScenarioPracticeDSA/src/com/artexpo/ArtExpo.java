package com.artexpo;

public class ArtExpo {

    public static void main(String[] args) {

        Artist[] artists = {
            new Artist("Aarav", 10),
            new Artist("Meera", 12),
            new Artist("Rohan", 11),
            new Artist("Neha", 15),
            new Artist("Karan", 14)
        };

        System.out.println("Before Sorting:");
        for (Artist a : artists) {
            System.out.println(a);
        }

        ArtExpoSorter.insertionSort(artists);

        System.out.println("\nAfter Sorting (By Registration Time):");
        for (Artist a : artists) {
            System.out.println(a);
        }
    }
}