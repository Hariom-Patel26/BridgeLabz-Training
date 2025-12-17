import java.util.*;
class ConvertKilometersToMiles {
    public static void main (String [] args){
    Scanner kb = new Scanner (System.in);
    int distanceInKilometers = kb.nextInt();


    double distanceInMiles = (distanceInKilometers * 0.621371);

    System.out.println(distanceInMiles);
    }
}