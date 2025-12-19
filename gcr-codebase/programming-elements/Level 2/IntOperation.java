//Write an IntOperation program to understand the precedence of operators
import java.util.Scanner;
class IntOperation {
    public static void main (String []args) {
    Scanner input = new Scanner (System.in);

    // taking input three numbers from user
    System.out.println("Enter number 1 : ");
    int a = input.nextInt();
    System.out.println("Enter number 2 : ");
    int b = input.nextInt();
    System.out.println("Enter number 3 : ");
    int c = input.nextInt();

    // perform operations
    int operation1 = a+b*c;
    int operation2 = a*b+c;
    int operation3 = c+a/b;
    int operation4 = a%b+c;

    // print the result of the above operations
    System.out.println("The results of int operations are "+operation1+", "+operation2+", "+operation3+ " and "+operation4);
    
    input.close();
   }
}


