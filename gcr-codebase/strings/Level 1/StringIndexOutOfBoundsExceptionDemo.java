import java.util.Scanner;
class StringIndexOutOfBoundsExceptionDemo {

    //method is to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {
        int size = text.length();
        text.charAt(size+5);
    }

    //method is to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {
        int size = text.length();
        try {
            text.charAt(size+5);
            }
        catch (StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            }
    }

    public static void main (String [] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter string : ");
        String text = kb.next();
        try {
            generateException(text);
        }
        catch (StringIndexOutOfBoundsException e){
            handleException(text);
        }
     kb.close();
    }

}