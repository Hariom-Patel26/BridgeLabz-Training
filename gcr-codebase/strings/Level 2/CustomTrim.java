import java.util.Scanner;
public class CustomTrim {

    static int[] trimIndex(String s) {
        int start = 0, end = s.length() - 1;
        while (s.charAt(start) == ' ') start++;
        while (s.charAt(end) == ' ') end--;
        return new int[]{start, end};
    }
    static String substring(String s, int start, int end) {
        String res = "";
        for (int i = start; i <= end; i++)
            res += s.charAt(i);
        return res;
    }
    static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int[] idx = trimIndex(text);
        String custom = substring(text, idx[0], idx[1]);
        String builtIn = text.trim();

        System.out.println("Custom Trim: " + custom + "Match: " + compare(custom, builtIn));
        sc.close();
    }
}
