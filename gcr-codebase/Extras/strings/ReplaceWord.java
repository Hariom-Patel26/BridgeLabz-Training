import java.util.Scanner;

class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine(); 
        String oldWord = sc.next();  
        String newWord = sc.next();

        String result = "";
        int i = 0;

        while (i < sentence.length()) {
            boolean match = true;

            // Check if oldWord matches starting at position i
            if (i + oldWord.length() <= sentence.length()) {
                for (int j = 0; j < oldWord.length(); j++) {
                    if (sentence.charAt(i + j) != oldWord.charAt(j)) {
                        match = false;
                        break;
                    }
                }
            } else {
                match = false;
            }
            if (match) {
                result += newWord;
                i += oldWord.length();
            } else {
                result += sentence.charAt(i);
                i++;
            }
        }
        System.out.println("Modified Sentence: " + result); // print
    }
}
