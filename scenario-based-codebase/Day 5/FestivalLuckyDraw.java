/* Festival Lucky Draw 
At Diwali mela, each visitor draws a number.
1. If the number is divisible by 3 and 5, they win a gift.
2. Use if, modulus, and loop for multiple visitors.
3. continue if input is invalid. */

import java.util.Scanner;

public class FestivalLuckyDraw {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println(" Welcome to the Diwali Mela Lucky Draw! ");
        System.out.println("Enter your drawn number. Win a gift if it's divisible by both 3 and 5!");

        while (true) {
            System.out.print("Enter your number (or -1 to exit): ");
            int number = kb.nextInt();

            if (number == -1) {
                System.out.println("Thank you for participating! Happy Diwali! ");
                break;
            }

            // Check for negative (except -1)
            if (number <= 0) {
                System.out.println("Please enter a positive number.");
                continue;
            }

            // Check if divisible by both 3 and 5
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("Congratulations! " + number + " wins a gift! ");
            } else {
                System.out.println("Better luck next time with " + number + "!");
            }
        }

        kb.close();
    }
}