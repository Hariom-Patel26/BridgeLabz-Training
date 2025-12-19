//Create a class MultiplicationTable to calculate the table multiplication from 6 to 9.
import java.util.Scanner;
class MultiplicationTable {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);

        // Input section : Declare variable taking input from user
        System.out.println("Enter a number : ");
        int number = input.nextInt();
          
        //Logic section : Calculate Multiplication Table.
        for (int i =6;i<10;i++) {
        int result = number*i;
        // display Multiplication Table
        System.out.println(number +"*"+ i +"="+ result);
        }
        input.close();
    }
}