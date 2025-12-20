//Create a class BelowHundredMultiples to find multiples using while loop.
import java.util.Scanner;
class BelowHundredMultiples {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        
        // Input section : declare a variable and taking input from user.
        System.out.println("Enter a number less than 100:");
        int number = input.nextInt();

        // Logic section : find multiples below 100 using while loop
        if (number > 0 && number < 100) {
            int counter = 100;
            while (counter >= 1) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        } 
         else {
            System.out.println("Invalid input");
        }

        input.close();
    }
}
