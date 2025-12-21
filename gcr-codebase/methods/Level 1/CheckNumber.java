import java.util.Scanner;
class CheckNumber {
    
    //Create a method to check whether a number is positive, negative, or zero
    public static int numberChecker (int number){
    if (number<0){
        return -1;
    }
    else if (number>0) {
        return 1;
    }
    return 0;
    }

    public static void main (String []args) { 
        Scanner input = new Scanner (System.in);

        // Input section : taking input from user
        System.out.println("Enter a number : ");
        int number = input.nextInt();

        // method call
        int answer = CheckNumber.numberChecker(number);
     
        // display results
        System.out.println("Method returns "+ answer);     
        input.close();
    }
}


