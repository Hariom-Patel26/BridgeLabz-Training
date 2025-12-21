// Create a class ReverseNumber to reverse a number using array
import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input section: Take number from user
        System.out.println("Enter a number:");
        long number = input.nextLong();
        long tempNumber = number;

        // Logic section: Count digits
        int count = 0;
        while (tempNumber != 0) {
            count++;
            tempNumber /= 10;
        }

        // Logic section: Store digits in array
        int[] digits = new int[count];
        tempNumber = number;
        for (int i = 0; i < count; i++) {
            digits[i] = (int)(tempNumber % 10);
            tempNumber /= 10;
        }

        // Output section: Display digits in reverse order
        System.out.print("Reversed number digits: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();

        input.close();
    }
}
