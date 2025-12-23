import java.util.Scanner;
public class SplitTextWithoutSplit {

    // Method to find string length without using
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }
    // Method to split text into words
    public static String[] customSplit(String text) {
        int length = findLength(text);

        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        int[] spaceIndexes = new int[wordCount + 1];
        int index = 1;
        spaceIndexes[0] = -1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        spaceIndexes[index] = length;

        // Extract words using indexes
        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            words[i] = text.substring(spaceIndexes[i] + 1, spaceIndexes[i + 1]);
        }

        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = kb.nextLine();

        String[] customWords = customSplit(text);

        String[] builtInWords = text.split(" ");

        boolean result = compareArrays(customWords, builtInWords);

        // Display words
        System.out.println("\nWords using custom split:");
        for (String word : customWords) {
            System.out.println(word);
        }
        System.out.println("\nWords using built-in split:");
        for (String word : builtInWords) {
            System.out.println(word);
        }
        System.out.println("\nDo both methods give the same result? " + result);
        kb.close();
    }
}
