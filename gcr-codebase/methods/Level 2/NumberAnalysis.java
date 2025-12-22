import java.util.Scanner;
public class NumberAnalysis {

    // Method to check positive or negative
    public static boolean isPositive(int n) {
        return n >= 0;
    }
    // Method to check even or odd
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
    // Method to compare two numbers
    public static int compare(int a, int b) {
        if (a > b) return 1;
        if (a == b) return 0;
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        // Checking each number
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            System.out.println(isPositive(arr[i]) ? (isEven(arr[i]) ? "Even" : "Odd") : "Negative");
        }
        // Comparing first and last element
        System.out.println(compare(arr[0], arr[4]));
        sc.close();
    }
}

