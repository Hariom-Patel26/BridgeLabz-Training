// Create a class MultiplicationTableUsingArray to print multiplication table of a number
import java.util.Scanner;
class MultiplicationTableUsingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input section: Take a number from user
        System.out.println("Enter a number:");
        int number = input.nextInt();

        // Logic section: Calculate multiplication table.
        int[] table =new int[10];
        for (int i = 0; i < 10; i++) {
            table[i] = number * (i + 1);
        }
        // Output section: Display multiplication table
        for (int i = 0; i< 10; i++) {
            System.out.println(number +" * "+ (i+1)+" = " + table[i]);
        }
        input.close();
    }
}
