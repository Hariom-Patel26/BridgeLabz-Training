//Create a class FindFactorial to find the factorial using for loop.
import java.util.Scanner;
class Factorial {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);

        // Input section : Declare a variable taking input from user
        System.out.println("Enter a number : ");
        int number = input.nextInt();
  
        //Logic section : Check for positive number and find the factorial.
        if (number>0){
         int factorial =0;
         for(int i =number;i>0;i--){
             factorial+=i;
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