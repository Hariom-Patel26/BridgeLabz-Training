/*12. Train Reservation Queue 🚆
Simulate a basic ticket booking system.
● Show menu with switch
● Allow multiple bookings using while-loop.
● Stop booking once seats reach zero (break).

*/

import java.util.Scanner;
public class TrainReservationQueue {
    public static void main (String [] args) {
	Scanner kb = new Scanner (System.in);
        
        int seatOccupancy = 0 ;
        int maximumCapacity = 10 ; 
	
	while (true) {
            // loop terminating condition
            if (seatOccupancy >= maximumCapacity) {
	        System.out.println("Seats are full, Reservation stoped ");
                break;
	    }
            // display menu
	    System.out.println("-----------MENU-----------");
	    System.out.println("Enter the option :");
	    System.out.println("1.-->Book a ticket");
	    System.out.println("2.-->Cancle a ticket");
	    System.out.println("3.-->Show occupancy");
	    System.out.println("--------------------------");
	    System.out.println("Enter optipon (1, 2, 3): ");

            // taking input from user
            int task = kb.nextInt();

	    switch (task) {
		case 1 :
                    System.out.println("your seat is booked");
		    seatOccupancy++;
		    break;

		case 2 :
		    if (seatOccupancy > 0) {
                        System.out.println("your seat is cancled");
		        seatOccupancy--;
    		        break;
		    } else {
			System.out.println("Seat is not booked yet ! Please book ticket first");
			break;
		    }

		case 3 :
                    System.out.println("Seat occupancy is :"+seatOccupancy);
		    break;
		default :
                System.out.println("Invalid input ! Please try again");
	    }
	}
        kb.close();
    }
}

