//Create a class SumComparision2 to check for the natural number and write the sum of n natural numbers using for loop and formula both.
import java.util.Scanner;
class SumComparision2 {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);

        // Input section : Declare a variable taking input from user
        System.out.println("Enter a number : ");
        int number = input.nextInt();
  
        //Logic section : Check for natural number and calculating sum using formula and for loop.
        if (number>0){
         int sumByFormula = number*(number+1)/2;
         int sumByLoop =0;
         for(int i =number;i>0;i--){
             sumByLoop+=i;
         }
         // Display sum of first n natural number.
         System.out.println("The sum of "+number+" natural numbers by formula is "+sumByFormula+" and by loop is "+sumByLoop);
        }
        else{
         // Display The number is not a natural number
         System.out.println("The number "+number+" is not a natural number");
        } 

        input.close();
    }
}