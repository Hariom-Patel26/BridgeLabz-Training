// Create a class NumberSum to find the sum of numbers until the user enters 0
import java.util.Scanner;
class NumberSum {
    public static void main (String []args) {

       //create object of Scanner 
       Scanner input = new Scanner (System.in);

       // Input section : taking input from user and a variable total
       double total = 0.0; 
       int store = 1;
    
       //Logic section : calculate total sum until user enters 0.
       while (store !=0){
           System.out.println("Enter a number : ");
           store = input.nextInt();
           // calculate total sum
           total +=store;
       }
        System.out.println(total);
     input.close();
    }
}
