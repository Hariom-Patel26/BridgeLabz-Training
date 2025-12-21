import java.util.Scanner;
class SimpleInterestSI {

    // create a method to calculate simple interest.
    public static double interestCalculation(double principle, double rate, double time){
    
    return (principle * rate * time)/100;
    }
    
    public static void main (String [] args) {
        Scanner kb = new Scanner (System.in);

        // create variables and taking input from user.
        System.out.println("Enter principle : ");
        double principle = kb.nextInt();
        System.out.println("Enter rate : ");
        double rate = kb.nextInt();
        System.out.println("Enter time : ");
        double time = kb.nextInt();
        
        double simpleInterest = SimpleInterestSI.interestCalculation(principle, rate, time);
        
        // Display Simple Interest
        System.out.println("The Simple Interest is "+simpleInterest+" for Principal "+principle+ ", Rate of Interest "+rate+" and Time "+time);
        kb.close();
    }
}
