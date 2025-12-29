/*10. Phone Recharge Simulator 📱
Take the user's mobile operator and amount.
● Use a switch to display offers.
● Loop to allow repeated recharges.
● Show balance after each recharge.
*/

import java.util.Scanner;
public class PhoneRechargeSimulator {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int balance = 0;
        char choice;
        do {
            System.out.println("\n--- Phone Recharge Simulator ---");
            System.out.println("Select Mobile Operator:");
            System.out.println("1. Jio");
            System.out.println("2. Airtel");
            System.out.println("3. Vi");
            System.out.println("4. BSNL");

            int operator = kb.nextInt();
            System.out.print("Enter Recharge Amount: ");
            int amount = kb.nextInt();
            balance += amount;

            switch (operator) {
                case 1:
                    System.out.println("Jio Offer: 1.5GB/day + Unlimited Calls");
                    break;

                case 2:
                    System.out.println("Airtel Offer: 2GB/day + Amazon Prime");
                    break;

                case 3:
                    System.out.println("Vi Offer: 1GB/day + Weekend Data Rollover");
                    break;

                case 4:
                    System.out.println("BSNL Offer: 1GB/day + 100 SMS/day");
                    break;

                default:
                    System.out.println("Invalid Operator!");
            }

            System.out.println("Recharge Successful ");
            System.out.println("Current Balance: " + balance);

            System.out.print("\nDo you want to recharge again? (y/n): ");
            choice = kb.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("\nThank you for using Phone Recharge Simulator");
        kb.close();
    }
}
