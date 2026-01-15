package com.payexpressapp;
import java.util.*;
import java.time.LocalDate;

public class PayXpressApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the customer ");
        String customer = sc.next();
        System.out.println("Enter Balance of the customer ");
        double balance = sc.nextInt();

        User user = new User(customer, balance);
        
        System.out.println("\nCustomer Name : "+user.getName());

        ArrayList<Bill> bills = new ArrayList<>();
        bills.add(new ElectricityBill(1200, LocalDate.now().plusDays(2)));
        bills.add(new InternetBill(800, LocalDate.now().plusDays(1)));
        bills.add(new WaterBill(400, LocalDate.now().plusDays(3)));

        while (true) {
            System.out.println("\n------- PayXpress -------");
            user.showBalance();

            for (int i = 0; i < bills.size(); i++) {
                Bill b = bills.get(i);
                System.out.println((i + 1) + ". " + b.type +" | Amount: " + b.amount +" | Paid: " + b.isPaid());
            }

            System.out.println("0. Exit");
            System.out.print("Select bill to pay: ");
            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Thank you for using PayXpress!");
                break;
            }

            if (choice >= 1 && choice <= bills.size()) {
                Bill selectedBill = bills.get(choice - 1);

                System.out.println("\n--- Reminder ---");
                selectedBill.sendReminder();

                System.out.print("Do you want to pay this bill? (1 = Yes, 0 = No): ");
                int payChoice = sc.nextInt();

                if (payChoice == 1) {
                    selectedBill.pay(user);
                }
            } else {
                System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}