//Create a class FriendsComparision to compare height and age of three friends.
import java.util.Scanner;
class FriendsComparision {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        
        // Input section : Declare variable and taking input from user
        System.out.println("enter height of 3");
        int amarHeight = input.nextInt();
        int akbarHeight = input.nextInt();
        int anthonyHeight = input.nextInt();
        System.out.println("enter age of 3");
        int amarAge = input.nextInt();
        int akbarAge = input.nextInt();
        int anthonyAge = input.nextInt();

        //Logic section : Calculate youngest and tallest amoung three of them.
        if (amarHeight>akbarHeight && amarHeight>anthonyHeight) {
         System.out.println("amar is tallest");
        }
        else if (amarHeight<akbarHeight && akbarHeight>anthonyHeight) {
         System.out.println("akbar is tallest");
        }
        else{
         System.out.println("anthony is tallest");
        }

        if (amarAge<akbarAge && amarAge<anthonyAge) {
         System.out.println("amar is youngest");
        }
        else if (amarAge>akbarAge && akbarAge<anthonyAge) {
         System.out.println("akbar is youngest");
        }
        else{
         System.out.println("anthony is youngest");
        }
        input.close();
    }
}
