//Create a class PowerUsingFor to calculate power using for loop.
import java.util.Scanner;
class PowerUsingFor {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        
        // Input section : declare  variables and taking input from user.
        System.out.println("Enter number and power:");
        int number = input.nextInt();
        int power = input.nextInt();

        // Logic section : calculate power of a given number using for loop.
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * number;
        }
        // Display result
        System.out.println("Result: " + result);

        input.close();
    }
}
