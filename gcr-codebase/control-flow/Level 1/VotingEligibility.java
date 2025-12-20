// create a class VotingEligibility to check whether a person can vote
import java.util.Scanner;
class VotingEligibility{
    public static void main (String []args){
        Scanner input = new Scanner (System.in);

        // Input section : taking input from user
        System.out.println("Enter age of a person : ");
        int age = input.nextInt();
  
        //Logic section : Checking whether a person can vote.
        if (age>=18){
         // Display "The person can vote."
         System.out.println("The person's age is "+age+ " and can vote.");
        }
        else{
        // Display "The person cannot vote."
        System.out.println("The person's age is "+age+ " and cannot vote.");
        } 
        input.close();
    }
}
