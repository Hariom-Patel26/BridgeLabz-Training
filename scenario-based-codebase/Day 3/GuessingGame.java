//7. The Number Guessing Game 🎲
//A game asks the player to guess a number between 1 and 100.
//Core Java Scenario Based Problem Statements
//● Use do-while loop.
//● Give hints like "Too high" or "Too low".
//● Count attempts and exit after 5 wrong tries.

import java.util.Scanner;
public class GuessingGame {
    public static void main(String [] args) {
        int number = (int)(Math.random()*100)+1;
        int count = 0;
        do {
            Scanner kb = new Scanner (System.in);
            System.out.println("Guess the number between 1 and 100 : ");
            int guess = kb.nextInt();
            count ++;
            if (number == guess) {
                System.out.println("You guess the right number : "+ guess);
                break;
            }
            else if (number < guess) {
                System.out.println("Your guess is too high");
            }
            else {
                System.out.println("Your guess is too low");
            }
        }
        while (count < 5);
    }
}
