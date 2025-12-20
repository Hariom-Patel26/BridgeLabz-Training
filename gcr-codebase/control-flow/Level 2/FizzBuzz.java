//Create a class FizzBuzz to print number and fizzbuzz.
import java.util.Scanner;
class FizzBuzz {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);

        // Input section : Declare variable taking input from user
        System.out.print("Enter a number : ");
        int number = input.nextInt();
          
        //Logic section : Calculate multiples.
        for (int i =1;i<=number;i++) {
         if (i%3==0){
         System.out.println("Fizz");
         }
         else if (i%5==0){
         System.out.println("Buzz");
         }
         else if(i%15==0){
         System.out.println("FizzBuzz");
         }
         else {
         System.out.println(i);
        }
        }
        input.close();
    }
}