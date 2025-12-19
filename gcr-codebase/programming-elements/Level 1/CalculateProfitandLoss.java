// Creating Class with name CalculateProfitandLoss for Calculating the profit and loss.
class CalculateProfitandLoss {
    public static void main (String [] args){
    // Create variable costPrice and sellingPrice.
    int costPrice = 129;
    int sellingPrice = 191;

    //Calculating the profit and profit percent.
    int profit = (sellingPrice-costPrice);
    int profitPercent = (profit*100)/costPrice;

    // Print the profit and profit percent.
    System.out.println("The Cost Price is INR "+costPrice+" and Selling Price is INR "+sellingPrice+"\nThe Profit is INR "+profit+" and the Profit Percentage is "+profitPercent);
    }
}