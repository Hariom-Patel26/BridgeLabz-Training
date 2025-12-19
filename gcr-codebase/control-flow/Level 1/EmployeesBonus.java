//Create a class EmployeesBonus to calculate the bonus amount of employee.
import java.util.Scanner;
class EmployeesBonus {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);

        // Input section : Declare two variables taking input from user
        System.out.println("Enter a salary : ");
        int salary = input.nextInt();
        System.out.println("Enter year : ");
        int year = input.nextInt();
  
        //Logic section : Calculate bonus.
        if (year>5) {
        int bonusAmount= salary+((salary/100)*5);
        // display bonus amount
        System.out.println("The bonus amount is "+bonusAmount);
        }
        input.close();
    }
}