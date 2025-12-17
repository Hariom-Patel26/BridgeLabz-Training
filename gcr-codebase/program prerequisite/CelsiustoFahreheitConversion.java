import java.util.*;
class CelsiustoFahreheitConversion{
    public static void main (String []args){
    Scanner kb = new Scanner (System.in);
    int Celsius =kb.nextInt();

    int Temperature = (Celsius * 9/5) + 32;

    System.out.println(Temperature);
    }
}