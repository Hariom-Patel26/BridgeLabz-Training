class CalculateSimpleInterest {
public static void main (String [] args){
Scanner kb = new Scanner (System.in);
int Principle = kb.nextInt();
double rate = kb.nextInt();
double time = kb.nextInt();
double SimpleInterest = (Principal * Rate * Time) / 100;
System.out.println(SimpleInterest);
}
}