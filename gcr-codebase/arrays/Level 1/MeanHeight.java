// Create a class MeanHeight to calculate mean height of 11 football players
import java.util.Scanner;

class MeanHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input section: Array to store heights of 11 players
        double[] heights = new double[11];
        double sum = 0;

        System.out.println("Enter height of 11 players (in cm):");
        for (int i = 0; i < 11; i++) {
            heights[i] = input.nextDouble();
            sum += heights[i];
        }

        // Logic section: Calculate mean
        double mean = sum / 11;

        // Output section: Display mean height
        System.out.println("Mean height of football team: " + mean + " cm");

        input.close();
    }
}
