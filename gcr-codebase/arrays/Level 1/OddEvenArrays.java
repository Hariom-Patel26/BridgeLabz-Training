// Create a class OddEvenArrays to separate odd and even numbers up to user input
import java.util.Scanner;

class OddEvenArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input section: Take number from user
        System.out.println("Enter a natural number:");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Error: Number is not a natural number.");
            input.close();
            return;
        }

        // Logic section: Separate odd and even numbers
        int maxSize = number / 2 + 1;
        int[] oddNumbers = new int[maxSize];
        int[] evenNumbers = new int[maxSize];
        int oddIndex = 0, evenIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;
            } else {
                oddNumbers[oddIndex++] = i;
            }
        }

        // Output section: Display odd and even arrays
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();

        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();

        input.close();
    }
}
