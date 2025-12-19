import java.util.Scanner;

// Program to calculate discounted fee
class StudentFeeDiscount {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner kb = new Scanner(System.in);

        // Take user input for fee and discount percentage
        System.out.print("Enter the student fee: ");
        double fee = kb.nextDouble();
        System.out.print("Enter the discount percentage: ");
        double discountPercent = kb.nextDouble();

        // Calculate discount and final fee
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        // Print discount amount and final fee
        System.out.println("The discount amount is INR " + discount +" and final discounted fee is INR " + finalFee);
    }
}
