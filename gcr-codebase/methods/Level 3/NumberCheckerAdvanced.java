public class NumberCheckerAdvanced {

    // Sum of digits
    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }
    // Sum of squares of digits
    public static double sumOfSquares(int[] digits) {
        double sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    // Check Harshad number
    public static boolean isHarshad(int number, int[] digits) {
        return number % sumDigits(digits) == 0;
    }

    // Digit frequency
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
        }
        for (int d : digits) {
            freq[d][1]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        int number = 21;
        int[] digits = NumberChecker.getDigits(number);
        System.out.println("Harshad=" + isHarshad(number, digits));
    }
}
