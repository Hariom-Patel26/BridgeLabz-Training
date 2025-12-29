/*9. School Bus Attendance System 🚍
Track 10 students' presence.
● Use for-each loop on names.
● Ask "Present or Absent?"
● Print total present and absent counts.

*/

import java.util.Scanner;
public class SchoolBusAttendanceSystem  {
    public static void main(String [] args) {
        Scanner kb = new Scanner (System.in);
        int totalPresent = 0;
        int totalAbsent = 0;
        String [] names = {"aman","ashish","shivam","naman","shital","anuj","ankit","sourabh","kartik","sohit"};
        for (String name : names) {
            System.out.println("Is "+name+" present :");
            char attendance = kb.next().charAt(0);
            if (attendance == 'p') {
                totalPresent ++;
            }
            else if (attendance == 'a') {
                totalAbsent ++;
            }
            else 
              System.out.println("Invalid input");
        }
        System.out.println("total number of present students : "+totalPresent);
        System.out.println("total number of absent students : "+totalAbsent);

    }
}