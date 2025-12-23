import java.util.Scanner;
class CharacterString {

     // method to compare two char arrays using loop
    public static boolean compare(char[] array1 , char[] array2){
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0 ; i < array1.length ; i++ ) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true; 
    }


    // method that return character array of given string
    public static char [] characterArray(String text) {
        char [] array = new char [text.length()];
        for (int i = 0 ; i < text.length() ; i++){
            array [i] = text.charAt(i);
        }
    return array ;
    }

    public static void main (String [] args){
    Scanner kb = new Scanner (System.in);
    
    // Taking input from user
    System.out.print("Enter string :");
    String str = kb.next();

    char [] array = characterArray(str);
    char [] arrayBuilt = str.toCharArray();
    boolean results = compare(array, arrayBuilt);
     
    System.out.println("Is both are same : " + results);
    System.out.println(str.toCharArray());
    kb.close();
    }
}