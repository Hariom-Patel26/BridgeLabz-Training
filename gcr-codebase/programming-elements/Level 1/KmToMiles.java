import java.util.Scanner;

// Program to convert kilometers to miles using scanner class
class KmToMiles {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner kb = new Scanner(System.in);
        // Take user input
        System.out.print("Enter distance in kilometers: ");
        double km = kb.nextDouble();

        // Convert km to miles (1 mile = 1.6 km)
        double miles = km / 1.6;

        // printing result
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }
}
