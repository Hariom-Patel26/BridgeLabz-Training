import java.util.*;
public class Happiness {

    public static long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int piv = 0;
        int index = happiness.length - 1;
        long ans = 0;

        while (k-- > 0) {
            if (happiness[index] <= piv)
                break;
            ans += happiness[index--] - piv;
            piv++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter number of elements: ");
        int n = kb.nextInt();

        int[] happiness = new int[n];

        // Input array elements
        System.out.println("Enter happiness values:");
        for (int i = 0; i < n; i++) {
            happiness[i] = kb.nextInt();
        }
        System.out.print("Enter k: ");
        int k = kb.nextInt();

        long result = maximumHappinessSum(happiness, k);

        // Output result
        System.out.println("Maximum Happiness Sum = " + result);
        kb.close();
    }
}