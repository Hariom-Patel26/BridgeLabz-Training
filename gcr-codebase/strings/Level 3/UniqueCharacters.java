import java.util.Scanner;
class UniqueCharacters {

    // Method to find length without length()
    static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    // Method to find unique characters
    static char[] uniqueChars(String s) {
        int len = getLength(s);
        char[] temp = new char[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (c == s.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) temp[index++] = c;
        }

        char[] result = new char[index];
        for (int i = 0; i < index; i++) result[i] = temp[i];
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine(); // input
        char[] result = uniqueChars(text);

        for (char c : result) {
          System.out.print(c + " ");
            } 
    }
}
