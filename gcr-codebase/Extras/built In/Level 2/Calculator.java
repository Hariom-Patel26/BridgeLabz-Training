import java.util.Scanner;

class Calculator {

    // Adds two numbers
    static int add(int a, int b) { return a + b; }

    // Subtracts two numbers
    static int subtract(int a, int b) { return a - b; }

    // Multiplies two numbers
    static int multiply(int a, int b) { return a * b; }

    // Divides two numbers
    static int divide(int a, int b) { return a / b; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt(); // input
        int a = sc.nextInt(); // input
        int b = sc.nextInt(); // input

        if (choice == 1) System.out.println(add(a, b)); // print
        else if (choice == 2) System.out.println(subtract(a, b)); // print
        else if (choice == 3) System.out.println(multiply(a, b)); // print
        else if (choice == 4) System.out.println(divide(a, b)); // print
    }
}
