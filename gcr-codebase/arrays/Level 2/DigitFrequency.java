import java.util.Scanner;
public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        // Takin input from user
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        int count = 0;
        long temp = number;

        // Count digits
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        int index = 0;

        // Store digits in array
        while (number > 0) {
            digits[index] = (int) (number % 10);
            index++;
            number /= 10;
        }

        int[] frequency = new int[10];

        // Find frequency
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        // Display frequency
        System.out.println("\nDigit Frequency");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0)
                System.out.println(i + " -> " + frequency[i]);
        }
        sc.close();
    }
}
