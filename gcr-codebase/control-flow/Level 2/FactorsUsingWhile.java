//Create a class FactorsUsingWhile to find factors of a number using while loop.
import java.util.Scanner;
class FactorsUsingWhile {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        
        // Input section : Declare variable and taking input from user
        System.out.println("Enter a positive number:");
        int number = input.nextInt();

        // Logic section : Check for natural number and Find factors using While loop
        if (number > 0) {
            int counter = 1;
            while(counter<number) {
                if (number % counter == 0) {
                    System.out.println(counter);
                   
                }
                 counter++;
            }
        } 
        else {
            System.out.println("Please enter a positive integer");
        } 

        input.close();
    }
}
