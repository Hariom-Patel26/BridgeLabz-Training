// Create a class PrimeNumberCheck to check whether a given number is Prime or not
import java.util.Scanner;
class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input section : Take number from user
        System.out.println("Enter a number");
        int number = input.nextInt();

        // Prime numbers are greater than 1
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            // Logic section : Check divisibility from 2 to number-1
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Output section
        if (isPrime) {
            System.out.println("Number is a Prime Number");
        } else {
            System.out.println("Number is not a Prime Number");
        }

        input.close();
    }
}
