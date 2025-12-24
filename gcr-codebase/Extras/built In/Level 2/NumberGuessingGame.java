import java.util.Scanner;

class NumberGuessingGame {

    // Generates random guess within range
    static int generateGuess(int low, int high) {
        return low + (int)(Math.random() * (high - low + 1));
    }

    // Gets user feedback
    static String getFeedback(Scanner sc) {
        return sc.next();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int low = 1, high = 100;

        while (true) {
            int guess = generateGuess(low, high);
            System.out.println("Guess: " + guess); // print

            String feedback = getFeedback(sc); // input

            if (feedback.equals("correct")) break;
            if (feedback.equals("low")) low = guess + 1;
            if (feedback.equals("high")) high = guess - 1;
        }

        System.out.println("Guessed Successfully"); // print
    }
}
