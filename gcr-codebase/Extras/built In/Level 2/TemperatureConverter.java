import java.util.Scanner;

class TemperatureConverter {

    // Converts Celsius to Fahrenheit
    static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    // Converts Fahrenheit to Celsius
    static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt(); // input
        double temp = sc.nextDouble(); // input

        if (choice == 1)
            System.out.println(celsiusToFahrenheit(temp)); // print
        else
            System.out.println(fahrenheitToCelsius(temp)); // print
    }
}
