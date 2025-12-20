//Create a class GreatestFactorUsingWhile to find greatest factor using while loop.
import java.util.Scanner;
class GreatestFactorUsingWhile {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        
        // Input section: Declare a variable and taking input from user.
        System.out.println("Enter a number:");
        int number = input.nextInt();
        int greatestFactor = 1;

        // Logic section : using while loop to find greatest factor of a given number.
        int counter = number - 1;
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }

        // Display result
        System.out.println("Greatest Factor: " + greatestFactor);

        input.close();
    }
}
