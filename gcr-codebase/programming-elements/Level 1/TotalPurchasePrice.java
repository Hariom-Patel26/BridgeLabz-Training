// Program to calculate total purchase price by using unit price and quantity
import java.util.Scanner;

class TotalPurchasePrice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // takin input unit price and quantity from user
        System.out.println("Enter unit price: ");
        int unitPrice = input.nextInt();
        System.out.println("Enter quantity: ");
        int quantity = input.nextInt();

        // Calculate total price
        int totalPrice = unitPrice * quantity;

        // Print total purchase price
        System.out.println("The total purchase price is INR " + totalPrice+ " if the quantity " + quantity+ " and unit price is INR " + unitPrice);

        input.close();
    }
}
