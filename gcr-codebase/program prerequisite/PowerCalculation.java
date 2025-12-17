// Creating Class with name powerCalculation indicating the purpose is to Calculate the Perimeter of a Rectangle and Display results.
import java.util.*;
class PowerCalculation {
    public static void main (String [] args){
    Scanner kb = new Scanner (System.in);
    int base = kb.nextInt();
    int exponent = kb.nextInt();

    double result = Math.pow(base,exponent);

    System.out.println(result);
    }
}