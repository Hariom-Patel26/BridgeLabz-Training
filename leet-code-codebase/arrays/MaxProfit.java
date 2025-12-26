import java.util.Scanner;
class MaxProfit {

    // Returns maximum profit
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter price on day " + (i + 1) + ": ");
            prices[i] = sc.nextInt();
        }

        System.out.println("Maximum Profit: " + maxProfit(prices));
        sc.close();
    }
}
