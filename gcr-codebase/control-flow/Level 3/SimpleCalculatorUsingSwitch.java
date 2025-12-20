// Create a class SimpleCalculator to perform basic arithmetic operations using switch case
import java.util.Scanner;
class SimpleCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input section : Take inputs from user
        System.out.println("Enter first number");
        double first = input.nextDouble();
        System.out.println("Enter second number");
        double second = input.nextDouble();
        System.out.println("Enter operator (+, -, *, /)");
        String op = input.next();

        // Logic section : Perform calculation using switch case
        switch (op) {
            case "+":
                System.out.println("Result = " + (first + second));
                break;

            case "-":
                System.out.println("Result = " + (first - second));
                break;

            case "*":
                System.out.println("Result = " + (first * second));
                break;

            case "/":
                System.out.println("Result = " + (first / second));
                break;

            default:
                System.out.println("Invalid Operator");
        }
        input.close();
    }
}
