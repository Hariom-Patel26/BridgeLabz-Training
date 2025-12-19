// Program to calculate quotient and remainder of two numbers
import java.util.Scanner;

class QuotientAndRemainder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input two numbers from user
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        // Calculate quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Print quotient and remainder
        System.out.println("The Quotient is " + quotient +" and Reminder is " + remainder +" of two number " + number1 + " and " + number2);

        input.close();
    }
}
