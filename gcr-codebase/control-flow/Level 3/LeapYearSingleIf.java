// Create a class LeapYearSingleIf to check whether a given year is a Leap Year or not using single if condition

import java.util.Scanner;

class LeapYearSingleIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input section : Declare variable and taking input from user
        System.out.println("Enter a year");
        int year = input.nextInt();

        // Logic section : Check Leap Year using single if condition and logical operators
        if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println("Year is a Leap Year");
        }
        else if (year >= 1582) {
            System.out.println("Year is not a Leap Year");
        }
        else {
            System.out.println("Year must be 1582 or later");
        }

        input.close();
    }
}
