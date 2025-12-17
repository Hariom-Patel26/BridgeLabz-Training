import java.util.*;
class CalculateSimpleInterest {
    public static void main (String [] args){
    Scanner kb = new Scanner (System.in);
    int principle = kb.nextInt();
    double rate = kb.nextInt();
    double time = kb.nextInt();

    double SimpleInterest = ((principle * rate * time) / 100);

    System.out.println(SimpleInterest);
   }
}