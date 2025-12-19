// Program to calculate maximum number of handshakes among N number of students.
import java.util.Scanner;
class Handshakes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // taking input number of students from user
        System.out.println("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // Calculate handshakes using formula
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Print The maximum number of handshakes
        System.out.println("The maximum number of handshakes is " + handshakes);

        input.close();
    }
}
