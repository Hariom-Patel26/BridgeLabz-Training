import java.util.Scanner;
class FirstNonRepeating {

    // Method to find first non-repeating character
    static char firstUnique(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;
        for (int i = 0; i < s.length(); i++)
            if (freq[s.charAt(i)] == 1) return s.charAt(i);
        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine(); // input
        char result = firstUnique(text);
        System.out.println(result); // print
    }
}
