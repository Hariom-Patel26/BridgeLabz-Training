import java.util.Scanner;
public class StringLengthWithoutMethod {

    // User-defined method to find string length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            // Infinite loop to access characters
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = kb.next();

        int customLength = findLength(input);
        int builtInLength = input.length();

        // Display results
        System.out.println("Length using user-defined method: " + customLength);
        System.out.println("Length using built-in length() method: " + builtInLength);
        kb.close();
    }
}
