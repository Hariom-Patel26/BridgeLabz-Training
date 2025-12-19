// Program to find the side of a square using perimeter
import java.util.Scanner;

class SquareSide {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // taking input perimeter from user
        System.out.print("Enter the perimeter of the square: ");
        int perimeter = input.nextInt();

        // Calculate side of the square
        int side = perimeter / 4;

        // Print result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        input.close();
    }
}
