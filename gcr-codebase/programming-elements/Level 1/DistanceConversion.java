// Program to convert distance from feet to yards and miles
import java.util.Scanner;

class DistanceConversion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // taking input distance in feet from user
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Convert distance into yards and miles
        double yards = distanceInFeet / 3;
        double miles = yards / 1760;

        // Print The distance
        System.out.println("The distance is " + yards + " yards and " + miles + " miles");

        input.close();
    }
}
