// Create a class Copy2Dto1D to copy 2D array elements into 1D array
import java.util.Scanner;

class Copy2Dto1D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input section: Take rows and columns
        System.out.println("Enter number of rows:");
        int rows = input.nextInt();
        System.out.println("Enter number of columns:");
        int cols = input.nextInt();

        // Input section: Create 2D array and take input
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        // Logic section: Copy 2D array to 1D array
        int[] array = new int[rows * cols];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index++] = matrix[i][j];
            }
        }

        // Output section: Display 1D array
        System.out.println("1D array elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        input.close();
    }
}
