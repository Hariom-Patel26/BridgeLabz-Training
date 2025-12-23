import java.util.Scanner;

class PalindromeCheck {

    // Logic 1: Iterative
    static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) if (s.charAt(i++) != s.charAt(j--)) return false;
        return true;
    }

    // Logic 2: Recursive
    static boolean isPalindromeRec(String s, int i, int j) {
        if (i >= j) return true;
        if (s.charAt(i) != s.charAt(j)) return false;
        return isPalindromeRec(s, i + 1, j - 1);
    }

    // Logic 3: Reverse
    static String reverse(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) r += s.charAt(i);
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine(); // input

        System.out.println(isPalindrome(text)); // print
        System.out.println(isPalindromeRec(text, 0, text.length() - 1)); // print
        System.out.println(text.equals(reverse(text))); // print
    }
}
