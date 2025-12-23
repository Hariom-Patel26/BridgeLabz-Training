import java.util.Scanner;
public class RockPaperScissors {

    static String computerChoice() {
        String[] c = {"rock", "paper", "scissors"};
        return c[(int)(Math.random() * 3)];
    }
    static int winner(String u, String c) {
        if (u.equals(c)) return 0;
        if ((u.equals("rock") && c.equals("scissors")) ||
            (u.equals("paper") && c.equals("rock")) ||
            (u.equals("scissors") && c.equals("paper")))
            return 1;
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Games: ");
        int n = sc.nextInt();
        sc.nextLine();

        int user = 0, comp = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter choice: ");
            String u = sc.nextLine();
            String c = computerChoice();
            int res = winner(u, c);
            if (res == 1) user++;
            else if (res == -1) comp++;
        }
        System.out.println("User Wins: " + user + "Computer Wins: " + comp + "User Win %: " + (user * 100.0 / n));
    }
}
