// Create a class FizzBuzz to display Fizz, Buzz, FizzBuzz for numbers up to user input
import java.util.Scanner;

class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input section: Take positive number from user
        System.out.println("Enter a positive integer:");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Number must be positive.");
        } else {

        // Logic section: Store FizzBuzz results in String array
        String[] results = new String[number + 1];
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
          }

        // Output section: Display results with position
        for (int i = 1; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
           }
        }
        input.close();
    }
}
