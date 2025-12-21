// Create a class VotingEligibility to check if 10 students can vote based on age
import java.util.Scanner;
class VotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input section : Array to store ages of 10 students
        int[] ages = new int[10];
        System.out.println("Enter age of 10 students:");
        for (int i = 0; i< ages.length; i++) {
            ages[i] = input.nextInt();
        }
        // Logic section : Check voting eligibility using for loop
        for (int i = 0; i < ages.length; i++) {
            if (ages[i]< 0) {
                System.out.println("Student " + (i+1) + ": Invalid age");
            } else if (ages[i] >= 18) {
                System.out.println("Student " + (i+1) + " with age " + ages[i] + " can vote.");
            } else {
                System.out.println("Student " + (i+1) + " with age " + ages[i] + " cannot vote.");
            }
        }
        input.close();
    }
}
