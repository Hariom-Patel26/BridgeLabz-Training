// Create a class StoreValues to store up to 10 positive numbers and calculate sum
import java.util.Scanner;

class StoreValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input section: Array to store up to 10 numbers
        double[] values = new double[10];
        double total = 0.0;
        int index = 0;

        // Logic section: Take input until 0, negative, or array full
        while (true) {
            System.out.println("Enter a positive number (0 or negative to stop):");
            double num = input.nextDouble();

            if (num <= 0 || index == 10) {
                break;
            }

            values[index] = num;
            index++;
        }

        // Logic section: Calculate sum
        System.out.println("Entered numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(values[i]);
            total += values[i];
        }

        // Output section: Display sum
        System.out.println("Sum of numbers: " + total);
        input.close();
    }
}
