// Create a class LeapYearIfElse to check whether a given year is a Leap Year or not using multiple if-else

import java.util.Scanner;

class LeapYearIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input section : Declare variable and taking input from user
        System.out.println("Enter a year");
        int year = input.nextInt();

        // Logic section : Check Leap Year conditions using multiple if-else
        if (year < 1582) {
            System.out.println("Year must be 1582 or later");
        }
        else if (year % 400 == 0) {
            System.out.println("Year is a Leap Year");
        }
        else if (year % 100 == 0) {
            System.out.println("Year is not a Leap Year");
        }
        else if (year % 4 == 0) {
            System.out.println("Year is a Leap Year");
        }
        else {
            System.out.println("Year is not a Leap Year");
        }

        input.close();
    }
}
