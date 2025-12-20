// Create a class DigitCount to count the number of digits in a given number
import java.util.Scanner;
class DigitCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input section : Take number from user
        System.out.println("Enter a number");
        int number = input.nextInt();

        int count = 0;
        // Logic section : Count digits using loop
        while (number != 0) {
            number = number / 10; 
            count++;
        }

        // Output section
        System.out.println("Number of digits = " + count);
        input.close();
     }
}
