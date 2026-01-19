package com.fleetmanager;

public class FleetManager {

    public static void main(String[] args) {

        Vehicle[] masterList = {
            new Vehicle("V101", 12000),
            new Vehicle("V102", 18000),
            new Vehicle("V201", 15000),
            new Vehicle("V202", 22000),
            new Vehicle("V301", 14000)
        };

        System.out.println("Before Merge Sort:");
        for (Vehicle v : masterList) {
            System.out.println(v);
        }

        FleetManagerSorter.mergeSort(masterList);

        System.out.println("\nAfter Merge Sort (Maintenance Schedule):");
        for (Vehicle v : masterList) {
            System.out.println(v);
        }
    }
}