import java.util.Scanner;

class GCDLCM {

    // Calculates GCD
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Calculates LCM
    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // input
        int b = sc.nextInt(); // input

        System.out.println("GCD: " + gcd(a, b)); // print
        System.out.println("LCM: " + lcm(a, b)); // print
    }
}
