/*13. Sandeep’s Fitness Challenge Tracker 🏋️
♂Each day Sandeep completes a number of push-ups.
● Store counts for a week.
● Use for-each to calculate total and average.
● Use continue to skip rest days.

*/
import java.util.Scanner;
public class SandeepFitnessChallengeTracker {
    public static void main (String [] args) {
	Scanner kb = new Scanner (System.in);
	int [] pushUps =new int[7];
	
	// rest day print statement
	System.out.println("enter 0 if the day is rest day");
        
	// calculating total and average pushup.
	for (int i = 0 ; i <7 ; i++) {
	    System.out.println("enter pushups on "+(i+1)+" day");
	    pushUps[i]= kb.nextInt();
	}
        int counts = 0;
	int restDays = 0;
	for (int nums : pushUps) {
	    if (nums == 0) {
		restDays++;
		continue;
	    } else {
		counts += nums ;
	    }
	}
	int average = (counts/(7-restDays));

	// display results.
	System.out.println("average pushUps :"+average);
        System.out.println("total pushUps :"+counts);
        kb.close();
    }
}
