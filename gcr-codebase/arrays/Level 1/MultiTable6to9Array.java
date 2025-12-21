// Create a class MultiTable6to9Array to print multiplication table of number from 6 to 9
import java.util.Scanner;

class MultiTable6to9Array{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input section: Take number from user
        System.out.println("Enter a number:");
        int number = input.nextInt();

        // Logic section: Calculate multiplication for 6 to 9
        int[] multiplicationResult = new int[4]; // 6,7,8,9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i-6] = number * i;
        }

        // Output section: Display result
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i-6]);
        }

        input.close();
    }
}
