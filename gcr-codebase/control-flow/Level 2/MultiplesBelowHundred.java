//Create a class MultiplesBelowHundred to find multiples below 100 using for loop.
import java.util.Scanner;
class MultiplesBelowHundred {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        
        // Input section : declare a variable and taking input from user.
        System.out.println("Enter a number less than 100:");
        int number = input.nextInt();

        // Logic section : find multiples below 100 using for loop
        if (number > 0 && number < 100) {
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        } 
         else {
            System.out.println("Invalid input");
        }

        input.close();
    }
}
