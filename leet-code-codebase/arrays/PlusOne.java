import java.util.Scanner;
class PlusOne {

    // Adds 1 to number represented as array
    public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        // If all digits are 9
        int[] newArr = new int[digits.length + 1];
        newArr[0] = 1;
        return newArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of digits: ");
        int n = sc.nextInt();

        int[] digits = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter digit " + (i + 1) + ": ");
            digits[i] = sc.nextInt();
        }

        int[] res = plusOne(digits);

        System.out.print("Result after plus one: ");
        for (int d : res) {
            System.out.print(d);
            sc.close();
        }
    }
}
