import java.util.Scanner;
class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++)
            freq[str.charAt(i)]++;

        char result = str.charAt(0);
        int max = freq[result];

        for (int i = 1; i < str.length(); i++) {
            if (freq[str.charAt(i)] > max) {
                max = freq[str.charAt(i)];
                result = str.charAt(i);
            }
        }

        System.out.println("Most Frequent Character: '" + result + "'");
    }
}
