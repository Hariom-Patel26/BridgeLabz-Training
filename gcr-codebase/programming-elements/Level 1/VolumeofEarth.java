// Program to calculate volume of earth in KM^3 and Miles^3
class VolumeofEarth {
    public static void main(String[] args) {
    
    // Radius of earth in KM
     int radiusInKilometer = 6378;

    // Calculating Radius of earth in miles
    double radiusInMiles = (radiusInKilometer*0.621371);
    // Calculating Volume of earth in Kilometer^3
    double VolumeOfEarthInKm =(4.0/3.0*Math.PI*Math.pow(radiusInKilometer,3));
    // Calculating Volume of earth in Miles^3
    double VolumeOfEarthInMiles =(4.0/3.0*Math.PI*Math.pow(radiusInMiles,3));
    
    //print The volume of earth in cubic kilometers and cubic miles
    System.out.println("The volume of earth in cubic kilometers is "+ VolumeOfEarthInKm +"and cubic miles is "+VolumeOfEarthInMiles);
    }
}

