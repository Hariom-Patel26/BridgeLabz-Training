// create a class SumOfNaturalNumbers to check for the natural number and write the sum of n natural numbers using formula and while loop both.
import java.util.Scanner;
class SumOfNaturalNumbers{
    public static void main (String []args){
        //create object of Scanner 
        Scanner input = new Scanner (System.in);

       // Input section : taking input from user
       System.out.println("Enter a number : ");
       int number = input.nextInt();
  
       //Logic section : Checking whether a number is a natural number.
       if (number>=0){
         int formulaSum = number*(number+1)/2;
         while()
         // Display sum of first n natural number.
         System.out.println("The sum of "+number+" natural numbers is "+sum);
        }
        else{
        // Display The number is not a natural number
        System.out.println("The number "+number+" is not a natural number");
        } 
     input.close();
    }
}
