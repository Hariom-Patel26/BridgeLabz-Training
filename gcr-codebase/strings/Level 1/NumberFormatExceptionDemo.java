import java.util.Scanner;
class NumberFormatExceptionDemo {

    //method is to generate NumberFormatException
    public static void generateException(String text) {
        int numbers = Integer.parseInt(text);
    }

    //method is to handle NumberFormatException
    public static void handleException(String text) {
        try {
            int numbers = Integer.parseInt(text);
            }
        catch (NumberFormatException e){
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