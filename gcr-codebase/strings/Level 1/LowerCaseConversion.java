import java.util.Scanner;
public class LowerCaseConversion {

    // Method to convert text to lowercase
    public static String toLowerManual(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            result += ch;
        }
        return result;
    }
    // Method to compare two strings
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the complete text:");
        String input = sc.nextLine();

        String builtInLower = input.toLowerCase();
        String manualLower = toLowerManual(input);

        boolean result = compareStrings(builtInLower, manualLower);

        System.out.println("Built-in lowercase : " + builtInLower + "Manual lowercase   : " + manualLower + "Comparison Result : " + result);
         sc.close();
    }
}
