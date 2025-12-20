// Create a class ArmstrongNumberCheck to check whether a given number is an Armstrong number or not
import java.util.Scanner;
class ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input section : Take number from user
        System.out.println("Enter a number");
        int number = input.nextInt();

        int originalNumber = number;
        int sum = 0;

        // Logic section : Calculate sum of cubes of digits
        while (originalNumber != 0) {
            int digit = originalNumber % 10;      
            sum = sum + (digit * digit * digit);   
            originalNumber = originalNumber / 10; 
         }

        // Output section
        if (sum == number) {
            System.out.println("Number is an Armstrong Number");
        } else {
            System.out.println("Number is not an Armstrong Number");
        }
        input.close();
    }
}
