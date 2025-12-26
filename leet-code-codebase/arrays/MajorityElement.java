import java.util.Scanner;
class MajorityElement {

    // Finds the majority element using Moore's Voting Algorithm
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        int element = 0;
        int count = 0;

        // Phase 1: Find candidate
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                element = nums[i];
                count = 1;
            } else if (nums[i] == element) {
                count++;
            } else {
                count--;
            }
        }

        // Phase 2: Verify candidate
        int count1 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == element) {
                count1++;
            }
        }

        if (count1 > n / 2) {
            return element;
        }

        return -1; // No majority element
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        int result = majorityElement(nums);

        if (result != -1) {
            System.out.println("Majority Element: " + result);
        } else {
            System.out.println("No Majority Element found");
            sc.close();
        }
    }
}
