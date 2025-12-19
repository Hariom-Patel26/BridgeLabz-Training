// Program to calculate height
import java.util.Scanner;
class CalculateHeight {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input for height in centimeters
        System.out.print("Enter the height: ");
        double heightInCM = input.nextDouble();

        //Calculating height in inches and feet
        double heightInInches = heightInCM/2.54;
        double heightInFeet = heightInInches/(12);

        // display the height in cm, inches, feet.
        System.out.println("Your Height in cm is "+heightInCM+" while in feet is "+heightInFeet+" and inches is "+heightInInches);
        
        input.close();
    }
}
