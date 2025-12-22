public class PalindromeChecker {
    // Method to reverse the digits array
    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }

        return rev;
    }

    // Method to compare two arrays
    public static boolean compareArrays(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }
    // Method to check whether the number is palindrome

    public static boolean isPalindrome(int[] digits) {
        int[] reversedDigits = reverseArray(digits);
        return compareArrays(digits, reversedDigits);
    }
    public static void main(String[] args) {
        int number = 121;

        int[] digits = NumberChecker.getDigits(number);

        // Checking palindrome and displaying result
        System.out.println("Palindrome=" + isPalindrome(digits));
    }
}
