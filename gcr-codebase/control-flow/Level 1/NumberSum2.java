// Create a class NumberSum2 to find the sum of numbers until the user enters 0 or negative number
import java.util.Scanner;
class NumberSum2 {
    public static void main (String []args) {

       //create object of Scanner 
       Scanner input = new Scanner (System.in);

       // Input section : taking input from user and a variable total
       double total = 0.0; 
    
       //Logic section : calculate total sum until user enters 0 or negative number.
       while (true){
           System.out.println("Enter a number : ");
           int store = input.nextInt();
           if(store <=0){
            break;
           } 
           // calculate total sum
           total +=store;
       }
        System.out.println(total);
     input.close();
    }
}
