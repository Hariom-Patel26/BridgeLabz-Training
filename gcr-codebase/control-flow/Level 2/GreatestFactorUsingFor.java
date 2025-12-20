//Create a class GreatestFactorUsingFor to find greatest factor using for loop.
import java.util.Scanner;
class GreatestFactorUsingFor {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        
        // Input section : Declare a variable and taking input from user.
        System.out.println("Enter a number:");
        int number = input.nextInt();
        int greatestFactor = 1;

        // Logic section : calculating greatest factor using for loop.
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        // Display result
        System.out.println("Greatest Factor: " + greatestFactor);

        input.close();
    }
}
