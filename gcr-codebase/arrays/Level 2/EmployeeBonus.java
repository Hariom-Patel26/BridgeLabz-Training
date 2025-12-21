// Create a class EmployeeBonus to calculate bonus based on years of service
import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input section: Array to store salary and years of service
        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Taking input with validation
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary for employee " + (i+1) + ":");
            salary[i] = input.nextDouble();
            if (salary[i] <= 0) {
                System.out.println("Invalid salary. Enter again.");
                i--;
                continue;
            }

            System.out.println("Enter years of service for employee " + (i+1) + ":");
            years[i] = input.nextDouble();
            if (years[i] < 0) {
                System.out.println("Invalid years of service. Enter again.");
                i--;
            }
        }

        // Logic section: Calculate bonus, new salary, total bonus, total old and new salary
        for (int i = 0; i < 10; i++) {
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Output section
        System.out.println("Total bonus payout: " + totalBonus);
        System.out.println("Total old salary: " + totalOldSalary);
        System.out.println("Total new salary: " + totalNewSalary);

        input.close();
    }
}
