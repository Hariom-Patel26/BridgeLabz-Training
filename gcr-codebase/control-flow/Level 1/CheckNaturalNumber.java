//Create a class CheckNaturalNumber to check for the natural number and write the sum of n natural numbers.
import java.util.Scanner;
class CheckNaturalNumber {
    public static void main (String []args){
        Scanner input = new Scanner (System.in);

        // Input section : Declare a variable taking input from user
        System.out.println("Enter a number : ");
        int number = input.nextInt();
  
        //Logic section : Checking whether a number is a natural number.
        if (number>=0) {
         int sum = number*(number+1)/2;
         // Display sum of first n natural number.
         System.out.println("The sum of "+number+" natural numbers is "+sum);
        }
        else {
         // Display The number is not a natural number
         System.out.println("The number "+number+" is not a natural number");
        } 

        input.close();
    }
}
