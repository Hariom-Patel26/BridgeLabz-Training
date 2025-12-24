import java.util.Scanner;

class Factorial {

    // Calculates factorial using recursion
    static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // input

        System.out.println(factorial(n)); // print
    }
}
