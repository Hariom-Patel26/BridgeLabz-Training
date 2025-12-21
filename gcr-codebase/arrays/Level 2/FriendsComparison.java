// Create a class FriendsComparison to find youngest and tallest among 3 friends
import java.util.Scanner;

class FriendsComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input section: Array to store ages and heights
        int[] age = new int[3];
        int[] height = new int[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        System.out.println("Enter age of Amar, Akbar, and Anthony:");
        for (int i = 0; i < 3; i++) {
            age[i] = input.nextInt();
        }

        System.out.println("Enter height of Amar, Akbar, and Anthony:");
        for (int i = 0; i < 3; i++) {
            height[i] = input.nextInt();
        }

        // Logic section: Find youngest
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // Logic section: Find tallest
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Output section
        System.out.println("Youngest friend: " + names[youngestIndex]);
        System.out.println("Tallest friend: " + names[tallestIndex]);

        input.close();
    }
}
