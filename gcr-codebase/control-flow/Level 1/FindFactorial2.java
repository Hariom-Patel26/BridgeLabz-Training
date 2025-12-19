//Create a class Factorial2 to find the factorial.
import java.util.Scanner;
class FindFactorial2 {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);

        // Input section : Declare a variable taking input from user
        System.out.println("Enter a number : ");
        int number = input.nextInt();
  
        //Logic section : Check for positive number and find the factorial.
        if (number>0){
         int factorial =0;
         int counter = number;
         while(counter >0) {
             factorial+=counter;
             counter--;
         }
         // Display results.
         System.out.println("The factorial of "+number+" is "+factorial);
        }
        else{
         // Display The number is not a natural number
         System.out.println("The number "+number+" is not a natural number");
        } 

        input.close();
    }
}