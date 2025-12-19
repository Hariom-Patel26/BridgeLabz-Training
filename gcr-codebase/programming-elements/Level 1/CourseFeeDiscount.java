// Program to calculate discounted course fee
class CourseFeeDiscount {
    public static void main(String[] args) {

        // Original course fee and Discount percentage 
        int fee = 125000;
        int discountPercent = 10;

        // Calculate discount amount and final fee after discount
        int discount = (fee * discountPercent) / 100;
        int finalFee = fee - discount;

        // Print the discount amount and final fee after discount
        System.out.println("The discount amount is INR " + discount +" and final discounted fee is INR " + finalFee);
    }
}
