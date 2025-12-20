// create a class IsFirstSmallest to check if the first is the smallest of the 3 numbers.

import java.util.Scanner;
class IsFirstSmallest {
    public static void main (String []args){ 
        Scanner input = new Scanner (System.in);

        // Input section : taking multiple inputs from user
        System.out.println("Enter a number1 : ");
        int number1 = input.nextInt();
        System.out.println("Enter a number2 : ");
        int number2 = input.nextInt();
        System.out.println("Enter a number2 : ");
        int number3 = input.nextInt();

        //Logic section : Checking whether the first is the smallest of the 3 numbers.
        if (number1 <number2 && number1 <number3){
         // Display the message yes 
         System.out.println("Is the first number the smallest? yes");
        }
        else {
         // Display the message no
         System.out.println("Is the first number the smallest? No");
        }
        input.close();
    }
}