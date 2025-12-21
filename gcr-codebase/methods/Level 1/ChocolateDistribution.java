import java.util.Scanner;
public class ChocolateDistribution {

    // Method to find chocolates per child and remaining chocolates
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int eachChildGets = number / divisor;
        int remaining = number % divisor;

        return new int[]{eachChildGets, remaining};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = sc.nextInt();

        System.out.print("Enter number of children: ");
        int numberOfChildren = sc.nextInt();

        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        System.out.println("Each child gets: " + result[0] + " chocolates and Remaining chocolates: " + result[1]);
        sc.close();
    }
}
