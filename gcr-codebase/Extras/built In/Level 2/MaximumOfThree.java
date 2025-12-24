import java.util.Scanner;

class MaximumOfThree {

    // Finds maximum of three numbers
    static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // input
        int b = sc.nextInt(); // input
        int c = sc.nextInt(); // input

        System.out.println(findMax(a, b, c)); // print
    }
}
