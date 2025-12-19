// Program to calculate area of a triangle
import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // take input base and height from user
        System.out.print("Enter base in inches: ");
        double base = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        // Calculate area of triangle.
        double areaSquareInches = 0.5 * base * height;
        double areaSquareCentimeters = areaSquareInches * 6.4516;

        // Print area of triangle in square inches and square centimeters
        System.out.println("The area of the triangle is "+ areaSquareInches + " square inches and "+ areaSquareCentimeters + " square centimeters");

        input.close();
    }
}
