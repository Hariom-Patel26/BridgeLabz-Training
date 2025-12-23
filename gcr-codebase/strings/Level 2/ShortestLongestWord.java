import java.util.Scanner;
public class ShortestLongestWord {

    public static int findLength(String s) {
        int i = 0;
        try {
            while (true) {
                s.charAt(i);
                i++;
            }
        } catch (Exception e) {}
        return i;
    }
    static String[] splitWords(String text) {
        int len = findLength(text);
        int count = 1;
        for (int i = 0; i < len; i++)
            if (text.charAt(i) == ' ') {
                count++;
              }
        String[] words = new String[count];
        String temp = "";
        int idx = 0;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) != ' ')
                temp += text.charAt(i);
            else {
                words[idx++] = temp;
                temp = "";
            }
        }
        words[idx] = temp;
        return words;
    }

    static String[][] wordLength2D(String[] words) {
        String[][] arr = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            arr[i][0] = words[i];
            arr[i][1] = String.valueOf(findLength(words[i]));
        }
        return arr;
    }

    static int[] shortestLongest(String[][] arr) {
        int min = Integer.parseInt(arr[0][1]);
        int max = min;
        for (int i = 1; i < arr.length; i++) {
            int len = Integer.parseInt(arr[i][1]);
            if (len < min) min = len;
            if (len > max) max = len;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] data = wordLength2D(words);
        int[] result = shortestLongest(data);

        System.out.println("Shortest Length: " + result[0]);
        System.out.println("Longest Length: " + result[1]);
        sc.close();
    }
}
