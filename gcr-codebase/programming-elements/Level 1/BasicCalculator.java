// Program to perform basic calculator operations like addition, subtraction, multiplication, division.
import java.util.Scanner;
class BasicCalculator {
    public static void main(String[] args) {

        // create object of scanner
        Scanner input = new Scanner(System.in);

        // input numbers from user
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        // Perform operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Display results
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+ number1 + " and " + number2 + " is "+ addition + ", " + subtraction + ", " + multiplication + ", and " + division);

        input.close();
    }
}

