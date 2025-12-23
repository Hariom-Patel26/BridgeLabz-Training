import java.util.Scanner;
class IllegalArgumentExceptionDemo {

    //method is to generate IllegalArgumentException
    public static void generateException(String text) {
        int beginIndex = 10;
        int endIndex = 5 ;

        String subName = text.substring(beginIndex, endIndex);
    }

    //method is to handle IllegalArgumentException
    public static void handleException(String text) {
        int beginIndex = 10;
        int endIndex = 5;
        try {
            String subName = text.substring( beginIndex, endIndex);
            }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            }
        catch (RuntimeException e) {
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
        catch (RuntimeException e){
            handleException(text);
        }
     kb.close();
    }

}