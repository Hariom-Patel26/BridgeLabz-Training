import java.util.Scanner;
public class FactorsProgram {

    //Counts the number of factors of a given number
    public static int countFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }
     // Finds all factors of a number and returns them as an array
        public static int[] findFactors(int number) {
        // First loop: count the number of factors
        int count = countFactors(number);
        
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }
    //Finds the greatest factor of a number (excluding the number itself)
    public static int findGreatestFactor(int[] factors) {
        if (factors.length >= 2) {
            return factors[factors.length - 2];
        }
        return factors[0];
    }
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
    public static long findProductOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
    public static double findProductOfCubesOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }
    public static void displayFactors(int[] factors) {
        System.out.print("Factors: ");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i]);
            if (i < factors.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        // Input: Get number from user
        System.out.print("Enter a number to find its factors: ");
        int number = kb.nextInt();
        
        // Find factors
        int[] factors = findFactors(number);
        
        // Display results
        System.out.println("\n===== Results for number: " + number + " =====");
        displayFactors(factors);
        System.out.print("Number of factors: " + factors.length);
        System.out.print(" Greatest factor (excluding itself): " + findGreatestFactor(factors));
        System.out.print(" Sum of factors: " + findSumOfFactors(factors));
        System.out.print(" Product of factors: " + findProductOfFactors(factors));
        System.out.print(" Product of cubes of factors: " + findProductOfCubesOfFactors(factors));
        
        kb.close();
    }
}