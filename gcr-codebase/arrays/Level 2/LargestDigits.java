// Create a class LargestDigits to find largest and second largest digits of a number
import java.util.Scanner;
import java.util.Arrays;

class LargestDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input section: Take number from user
        System.out.println("Enter a number:");
        long number = input.nextLong();

        // Logic section: Store digits in array (dynamic size)
       int maxDigit = 10;
       int[] digits = new int[maxDigit];
       int index = 0;

       long tempNumber = number;
       while (tempNumber != 0) {

       if (index == maxDigit) {
        maxDigit += 10;
        int[] newDigits = new int[maxDigit];  
        for (int i = 0; i < digits.length; i++) {
            newDigits[i] = digits[i];
        }
        digits = newDigits;     }
    
        digits[index++] = (int)(tempNumber % 10);
        tempNumber /= 10;
        }

        // Logic section: Find largest and second largest digit
        int largest = 0, secondLargest = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Output section
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        input.close();
    }
}
