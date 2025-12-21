import java.util.Scanner;
class AthleteRuns {

    // create a method to find the number of rounds.
    public static int roundCalculation(int sideOne, int sideTwo, int sideThree){
    
    int perimeter = (sideOne + sideTwo + sideThree);
    
    return 5000/perimeter;
    }
    
    public static void main (String [] args) {
        Scanner kb = new Scanner (System.in);

        // create variable and taking input from user.
        System.out.println("Enter three sides : ");
        int sideOne = kb.nextInt();
        int sideTwo = kb.nextInt();
        int sideThree = kb.nextInt();
        
        
        // method call 
        int rounds = AthleteRuns.roundCalculation(sideOne, sideTwo, sideThree);
        // Display .
        System.out.println("The number rounds :" + rounds);
        kb.close();
    }
}
