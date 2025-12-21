import java.util.Scanner;
class NumberOfHandshakes {

    // create a method to find the maximum number of handshakes.
    public static double handshakeCalculation (int number){
    
    return (number*(number-1))/2;
    }
    
    public static void main (String [] args) {
        Scanner kb = new Scanner (System.in);

        // create variable and taking input from user.
        System.out.println("Enter number of Students  : ");
        int numberOfStudents  = kb.nextInt();
                
        double handshakes = NumberOfHandshakes.handshakeCalculation(numberOfStudents);
        
        // Display maximum number of handshakes among students.
        System.out.println("The number of possible handshakes : "+handshakes);
        kb.close();
    }
}
