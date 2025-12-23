import java.util.Scanner;
class SubstringCompare {

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

    // method to find substring using loop
    public static String subString(String str1, int start, int end) {
    String text = "";
    for (int i = start ; i < end ; i++) {
        text += str1.charAt(i);
        }
    return text;
    }

    public static void main (String [] args){
    Scanner kb = new Scanner (System.in);
    
    // Taking input from user

    System.out.println("Enter string :");
    String str = kb.next();
    System.out.println(" Starting index :");
    int startIndex = kb.nextInt();
    System.out.println(" Ending index :");
    int endIndex = kb.nextInt();
    
    String subStringOne = subString(str, startIndex , endIndex);
    String subStringTwo = str.substring(startIndex , endIndex);
    boolean results = compare(subStringOne , subStringTwo);


    if (results) {
        System.out.println("subStrings "+ subStringOne + " are equal");
       }
    else {
        System.out.println("subStrings "+ subStringOne + " are not equal");
       }
    }
}