//Create a class oddEvenInRange to find the factorial.
import java.util.Scanner;
class OddEvenInRange {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);

        // Input section : Declare a variable taking input from user
        System.out.println("Enter a number : ");
        int number = input.nextInt();
  
        //Logic section : Check for natural number and find the odd and even number.
        if (number>0) {
         for (int i =1;i<=number;i++) {
         if (i%2==0) {
         System.out.println("The number "+i+" is a even number");
         }
         else {
          System.out.println("The number "+i+" is a odd number");
          }
         }
        }
        else{
         // Display The number is not a natural number
         System.out.println("The number "+number+" is not a natural number");
        } 

        input.close();
    }
}