// Create a class RocketCountDown1 to count down the number using a while loop for a rocket launch
import java.util.Scanner;
class RocketCountDown1 {
    public static void main (String []args) {

       //create object of Scanner 
       Scanner input = new Scanner (System.in);

       // Input section : taking input from user
       System.out.println("Enter a number : ");
       int counter = input.nextInt();
    
       //Logic section : count down the number using a while loop for a rocket launch.
       while (counter >0){
           // prints the current value of counter
           System.out.print(counter+" ");
           counter--;
       }
     input.close();
    }
}
