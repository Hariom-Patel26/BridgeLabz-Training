// Create a class AbundantNumberCheck to check whether a given number is an Abundant Number
import java.util.Scanner;
class AbundantNumberCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input section : Take number from user
        System.out.println("Enter a number");
        int number = input.nextInt();

        int sum = 0;

        // Logic section : Find sum of all divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        // Check Abundant condition
        if (sum > number) {
            System.out.println(" Abundant Number");
        } else{
            System.out.println("Not an Abundant Number");
        }
        input.close();
    }
}
