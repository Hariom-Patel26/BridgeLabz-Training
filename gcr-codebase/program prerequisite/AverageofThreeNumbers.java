import java.util.*;
class AverageofThreeNumbers {
    public static void main (String [] args){
    Scanner kb = new Scanner (System.in);
    int num1 = kb.nextInt();
    int num2 = kb.nextInt();
    int num3 = kb.nextInt();

    double average = ((num1+num2+num3)/3);

    System.out.println(average);
    }
}