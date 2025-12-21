public class NumberTypeChecker {

    // Method to find sum of proper divisors
    public static int sumOfDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
    // Method to check Perfect Number
    public static boolean isPerfect(int number) {
        return sumOfDivisors(number) == number;
    }
    // Method to check Abundant Number
    public static boolean isAbundant(int number) {
        return sumOfDivisors(number) > number;
    }
    // Method to check Deficient Number
    public static boolean isDeficient(int number) {
        return sumOfDivisors(number) < number;
    }
    // Method to find factorial
    public static int factorial(int digit) {
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check Strong Number
    public static boolean isStrong(int number) {
        int temp = number;
        int sum = 0;

        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == number;
    }

    public static void main(String[] args) {
        int number = 145;
        System.out.println("Perfect=" + isPerfect(number) + " Abundant=" + isAbundant(number)+ " Deficient=" + isDeficient(number)+ " Strong=" + isStrong(number));
    }
}
