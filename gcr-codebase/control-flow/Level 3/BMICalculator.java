// Create a class BMICalculator to calculate BMI and determine weight status
import java.util.Scanner;
class BMICalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input section : Take weight (kg) and height (cm) from user
        System.out.println("Enter weight in kg");
        double weight = input.nextDouble();
        System.out.println("Enter height in cm");
        double heightCm = input.nextDouble();

        // Convert height from cm to meter
        double heightMeter = heightCm / 100;

        // Logic section : Calculate BMI
        double bmi = weight / (heightMeter * heightMeter);

        // Output BMI value
        System.out.println("BMI = " + bmi);

        // Determine weight status using if-else
        if (bmi <= 18.4) {
            System.out.println("Status : Underweight");
        }
        else if (bmi <= 24.9) {
            System.out.println("Status : Normal");
        }
        else if (bmi <= 39.9) {
            System.out.println("Status : Overweight");
        }
        else {
            System.out.println("Status : Obese");
        }

        input.close();
    }
}
