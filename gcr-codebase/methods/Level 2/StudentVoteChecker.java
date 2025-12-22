import java.util.Scanner;
public class StudentVoteChecker {

    // Method to check voting eligibility
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        if (age >= 18) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            int age = sc.nextInt();
            System.out.println(canStudentVote(age));
        }
        sc.close();
    }
}
