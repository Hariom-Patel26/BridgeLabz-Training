import java.util.Scanner;
public class ParkingSystem {
    public static void main(String [] args) {
        Scanner kb = new Scanner (System.in);
        int maxSize = 5;
        int occupancy = 0;
        while(true) {
            System.out.println("Enter your input : ");
            String str = kb.next().trim().toLowerCase();
            if (str.equals("close")) {
                System.out.println("you enter close and you are out of the system");
                break;
            }
            switch(str) {
                case "park":
                    System.out.println("your vehicle is parked");
                    occupancy++;
                    break;

                case "exit":
                if (occupancy==0){
                    System.out.println("No vehicle is parked");
                    break;
                }
                else {
                    System.out.println("your vehicle exist");
                    occupancy--;
                    break;
                }
                case "occupancy":
                System.out.println("Parking occupancy is : "+occupancy);
                break;

                default :
                System.out.println("you entered invalid input");
                break;
            }
            if (occupancy==maxSize) {
                System.out.println("parking is full");
                break;
            }
        }
        kb.close();
    }

}