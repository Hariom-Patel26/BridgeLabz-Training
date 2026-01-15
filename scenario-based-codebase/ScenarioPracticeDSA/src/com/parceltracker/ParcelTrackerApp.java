package com.parceltracker;

import java.util.Scanner;

public class ParcelTrackerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ParcelLinkedList tracker = new ParcelLinkedList();

        tracker.addStage("Packed");
        tracker.addStage("Shipped");
        tracker.addStage("In Transit");
        tracker.addStage("Delivered");

        while (true) {
            System.out.println("1. Track Parcel");
            System.out.println("2. Add Intermediate Checkpoint");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                tracker.trackParcel();
            } else if (choice == 2) {
                System.out.print("Enter existing stage: ");
                String existingStage = scanner.nextLine();
                System.out.print("Enter new checkpoint: ");
                String newStage = scanner.nextLine();
                tracker.addIntermediateStage(existingStage, newStage);
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
        scanner.close();
    }
}
