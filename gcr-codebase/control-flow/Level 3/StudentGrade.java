// Create a class StudentGrade to calculate percentage, grade and remarks based on marks

import java.util.Scanner;

class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input section : Declare variables and take marks from user
        System.out.println("Enter marks of Physics, Chemistry and Maths");
        int physics = input.nextInt();
        int chemistry = input.nextInt();
        int maths = input.nextInt();

        // Calculation section : Calculate total and percentage
        int total = physics + chemistry + maths;
        double percentage = total / 3.0;

        // Output average/percentage
        System.out.println("Average Mark = " + percentage);

        // Logic section : Decide grade and remarks using if-else
        if (percentage >= 80) {
            System.out.print("Grade : A , ");
            System.out.println("Remarks : Level 4, above agency-normalized standards");
        }
        else if (percentage >= 70) {
            System.out.print("Grade : B , ");
            System.out.println("Remarks : Level 3, at agency-normalized standards");
        }
        else if (percentage >= 60) {
            System.out.print("Grade : C , ");
            System.out.println("Remarks : Level 2, below but approaching agency-normalized standards");
        }
        else if (percentage >= 50) {
            System.out.print("Grade : D , ");
            System.out.println("Remarks : Level 1, well below agency-normalized standards");
        }
        else if (percentage >= 40) {
            System.out.print("Grade : E , ");
            System.out.println("Remarks : Level 1, too below agency-normalized standards");
        }
        else {
            System.out.print("Grade : R , ");
            System.out.println("Remarks : Remedial standards");
        }

        input.close();
    }
}
