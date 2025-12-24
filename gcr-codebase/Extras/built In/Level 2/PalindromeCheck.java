import java.util.Scanner;

class PalindromeCheck {

    // Checks palindrome string
    static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j)
            if (s.charAt(i++) != s.charAt(j--)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine(); // input

        System.out.println(isPalindrome(text) ? "Palindrome" : "Not Palindrome"); // print
    }
}
