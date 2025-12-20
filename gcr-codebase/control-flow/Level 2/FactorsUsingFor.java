//Create a class FactorsUsingFor to find factors of a number using for loop.
import java.util.Scanner;
class FactorsUsingFor {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        
        // Input section : Declare variable and taking input from user
        System.out.println("Enter a positive number:");
        int number = input.nextInt();

        // Logic section : Check for natural number and Find factors using for loop
        if (number > 0) {
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        } 
        else {
            System.out.println("Please enter a positive integer");
        } 

        input.close();
    }
}
