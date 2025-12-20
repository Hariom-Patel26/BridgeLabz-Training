//Create a class PowerUsingWhile to calculate power using while loop.
import java.util.Scanner;
class PowerUsingWhile {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        
        // Input section : declare  variables and taking input from user.
        System.out.println("Enter number and power:");
        int number = input.nextInt();
        int power = input.nextInt();

        // Logic section : calculate power of a given number using while loop.
        int result = 1;
        int counter = 0;
        while (counter < power) {
            result = result * number;
            counter++;
        }
        // Display result
        System.out.println("Result: " + result);

        input.close();
    }
}
