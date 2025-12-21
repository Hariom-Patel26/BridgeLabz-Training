import java.util.Scanner;
public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input from user.
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];
        
        // calculating grades of students
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Physics marks: ");
            physics[i] = sc.nextInt();

            System.out.print("Enter Chemistry marks: ");
            chemistry[i] = sc.nextInt();

            System.out.print("Enter Maths marks: ");
            maths[i] = sc.nextInt();

            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

            if (percentage[i] >= 90)
                grade[i] = 'A';
            else if (percentage[i] >= 75)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else
                grade[i] = 'D';
        }
        // display results
        System.out.println("\nPhysics Chemistry Maths Percentage Grade");
        for (int i = 0; i < n; i++) {
            System.out.println(physics[i] + "\t" + chemistry[i] + "\t" +maths[i] + "\t" + percentage[i] + "\t" + grade[i]);
        }
        sc.close();
    }
}
