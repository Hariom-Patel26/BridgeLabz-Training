import java.util.Scanner;
public class CharacterType {

    static String checkChar(char ch) {
        if (ch >= 'A' && ch <= 'Z')
            ch = (char)(ch + 32);

        if (ch >= 'a' && ch <= 'z') {
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                return "Vowel";
            else
                return "Consonant";
        }
        return "Not a Letter";
    }
    static String[][] analyze(String s) {
        String[][] arr = new String[s.length()][2];
        for (int i = 0; i < s.length(); i++) {
            arr[i][0] = String.valueOf(s.charAt(i));
            arr[i][1] = checkChar(s.charAt(i));
        }
        return arr;
    }
    static void display(String[][] arr) {
        System.out.println("Char\tType");
        for (String[] row : arr)
            System.out.println(row[0] + "\t" + row[1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine();
        display(analyze(s));
        sc.close();
    }
}
