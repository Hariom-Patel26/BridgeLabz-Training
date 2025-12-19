// Creating Class with name ConvertDistance indicating the purpose is to convert distance of 10.8 kilometer into miles and Display results.
class ConvertDistance {
    public static void main (String [] args){
    double distanceInKilometer = 10.8;

    //Calculating the distance in miles.
    double distanceInMiles = (distanceInKilometer * 1.6);

    // Display the distance in miles.
    System.out.println("The distance 10.8 km in miles is"+ distanceInMiles);
    }
}