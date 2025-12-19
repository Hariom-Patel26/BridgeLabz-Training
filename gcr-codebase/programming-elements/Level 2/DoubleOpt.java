//Write an DoubleOpt program to understand the precedence of operators
import java.util.Scanner;
class DoubleOpt {
    public static void main (String []args) {
    Scanner input = new Scanner (System.in);

    // taking input three numbers from user
    System.out.println("Enter number 1 : ");
    double a = input.nextInt();
    System.out.println("Enter number 2 : ");
    double b = input.nextInt();
    System.out.println("Enter number 3 : ");
    double c = input.nextInt();

    // perform operations
    double operation1 = a+b*c;
    double operation2 = a*b+c;
    double operation3 = c+a/b;
    double operation4 = a%b+c;

    // print the result of the above operations
    System.out.println("The results of Double operations are "+operation1+", "+operation2+", "+operation3+ " and "+operation4);
    
    input.close();
   }
}

