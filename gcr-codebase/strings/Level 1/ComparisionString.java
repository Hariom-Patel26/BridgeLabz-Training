import java.util.Scanner;
class ComparisionString {

    // method to compare string using loop
    public static boolean compare(String str1 , String str2){
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0 ; i < str1.length() ; i++ ) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true; 
    }

    public static void main (String [] args){
    Scanner kb = new Scanner (System.in);
    
    // Taking input from user

    System.out.println("Enter string 1 :");
    String str1 = kb.next();
    System.out.println("Enter string 2 :");
    String str2 = kb.next();

    boolean resultsOne = compare(str1, str2);
    boolean resultsTwo = str1.equals(str2);

    if (resultsOne == resultsTwo) {
        System.out.println("Is str1 equals to str2 ? :"+ resultsOne);
       }
    }
}