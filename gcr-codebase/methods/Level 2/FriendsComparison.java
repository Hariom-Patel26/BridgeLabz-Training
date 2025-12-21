import java.util.Scanner;
public class FriendsComparison {

    // Find youngest age
    public static int findYoungest(int[] ages) {
        int min = ages[0];
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < min) {
                min = ages[i];
            }
        }
        return min;
    }
    // Find tallest height
    public static double findTallest(double[] heights) {
        double max = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > max) {
                max = heights[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            ages[i] = sc.nextInt();
            heights[i] = sc.nextDouble();
        }
        System.out.println("Youngest=" + findYoungest(ages) + " Tallest=" + findTallest(heights));
        sc.close();
    }
}

