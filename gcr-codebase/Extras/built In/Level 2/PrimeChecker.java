import java.util.Scanner;

class PrimeChecker {

    // Checks whether number is prime
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0) {
                return false; }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // input

        System.out.println(isPrime(n) ? "Prime" : "Not Prime"); // print
    }
}
