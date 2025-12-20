// Create a class HarshadNumberCheck to check whether a given number is a Harshad Number
import java.util.Scanner;
class HarshadNumberCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input section : Take number from user
        System.out.println("Enter a number");
        int number = input.nextInt();

        int sum = 0;
        int originalNumber = number;

        // Logic section : Calculate sum of digits
        while (originalNumber != 0) {
            int digit = originalNumber % 10;  
            sum = sum + digit;                
            originalNumber = originalNumber /10; 
        }

        // Check Harshad condition
        if (number % sum == 0) {
            System.out.println("Harshad Number ");
        } else {
            System.out.println("Not a Harshad Number");
        }
        input.close();
    }
}
