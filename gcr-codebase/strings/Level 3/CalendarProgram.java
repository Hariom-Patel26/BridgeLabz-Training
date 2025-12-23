import java.util.Scanner;
class CalendarProgram {

    // Method to check leap year
    static boolean isLeap(int y) {
        return (y % 4 == 0 && y % 100 != 0) || y % 400 == 0;
    }

    // Method to get first day
    static int firstDay(int m, int y) {
        int d = 1;
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (d + x + 31 * m0 / 12) % 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt(); // input
        int year = sc.nextInt(); // input

        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (month == 2 && isLeap(year)) days[1] = 29;

        int start = firstDay(month, year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat"); // print

        for (int i = 0; i < start; i++) System.out.print("    "); // print
        for (int d = 1; d <= days[month - 1]; d++) {
            System.out.printf("%3d ", d); // print
            if ((d + start) % 7 == 0) System.out.println(); // print
        }
    }
}
