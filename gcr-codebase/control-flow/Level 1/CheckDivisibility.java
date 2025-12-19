// create a class CheckDivisibility to check if a number is divisible by 5
import java.util.Scanner;

class CheckDivisibility {
    public static void main (String []args){
        Scanner input = new Scanner (System.in);

        // Input section : Declare a variable taking input from user
        System.out.println("Enter a number : ");
        int number = input.nextInt();

        //Logic section : Checking whether the number is divisible by 5 or not
        if (number %5 == 0) {
         // Display the message yes 
         System.out.println("Is the number "+number+" divisible by 5 ?"+" Yes");
        }
        else {
         // Display the message no
         System.out.println("Is the number "+number+" divisible by 5 ?"+" No");
        }

        input.close();
    }
}