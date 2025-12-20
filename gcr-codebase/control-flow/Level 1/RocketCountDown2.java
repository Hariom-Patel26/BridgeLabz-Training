// Create a class RocketCountDown2 to count down the number using a for loop for a rocket launch
import java.util.Scanner;
class RocketCountDown2 {
    public static void main (String []args) {

       //create object of Scanner 
       Scanner input = new Scanner (System.in);

       // Input section : taking input from user
       System.out.println("Enter a number : ");
       int counter = input.nextInt();
    
       //Logic section : count down the number using a for loop for a rocket launch.
       for (int i =counter;i>0;i--){
           // prints the current value of counter
           System.out.print(i+" ");
       }
     input.close();
    }
}
