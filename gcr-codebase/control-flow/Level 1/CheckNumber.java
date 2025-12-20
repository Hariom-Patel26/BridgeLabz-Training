// Writing a java code to check whether a number is positive, negative, or zero
import java.util.Scanner;
class CheckNumber {
    public static void main (String []args) { 
    Scanner input = new Scanner (System.in);

    // Input section : taking input from user
    System.out.println("Enter a number : ");
    int number = input.nextInt();
    
    //Logic section : check whether a number is positive, negative, or zero.

    if (number<0){ 
    System.out.println("negative");
    }
    else if (number>0){
    System.out.println("positive");
    }
    else {
    System.out.println("zero");
    } 
    input.close();
    }
}