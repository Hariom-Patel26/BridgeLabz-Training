// create a class LargestOfThree to check if the first, second, or third number is the largest of the three.
import java.util.Scanner;
class LargestOfThree {
    public static void main (String []args){
        //create object of Scanner 
        Scanner input = new Scanner (System.in);

        // Input section : taking multiple inputs from user
        System.out.println("Enter a number1 : ");
        int number1 = input.nextInt();
        System.out.println("Enter a number2 : ");
        int number2 = input.nextInt();
        System.out.println("Enter a number2 : ");
        int number3 = input.nextInt();

        //Logic section : Checking whether the first, second, or third number is the largest of the three.

        if (number1 > number2 && number1 > number3){
         // Display the message first number largest "Yes" 
         System.out.println("Is the first number the smallest? yes");
        }
        else if(number2 > number1 && number2 > number3){
         // Display the message second number largest "Yes"
         System.out.println("Is the second number the largest? Yes");
        }
        else if (number3 > number1 && number3 > number2){
        // Display the message third number largest "Yes"
        System.out.println("Is the third number the largest? Yes");
        }
        else {
        // Display the message Duplicate number is present
        System.out.println("Duplicate number is present");
        }
        input.close();
    }
}