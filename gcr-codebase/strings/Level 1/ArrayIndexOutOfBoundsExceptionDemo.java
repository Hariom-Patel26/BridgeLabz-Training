import java.util.Scanner;
public class ArrayIndexOutOfBoundsExceptionDemo {

    //method is to generate ArrayIndexOutOfBoundsException
    public static void generateException(String [] names) {
        String name = names[names.length + 1] ;
    }

    //method is to handle ArrayIndexOutOfBoundsException
    public static void handleException(String [] names) {
        try {
            String name = names[names.length + 1] ;
            }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
            }
    }

    public static void main (String [] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int size = kb.nextInt();

        String [] names = new String [size];
        for (int i = 0 ; i < size ; i++ ) {
             names [i] = kb.next();
            } 
        try {
            generateException(names);
        }
        catch (RuntimeException e){
            handleException(names);
        }
     kb.close();
    }

}