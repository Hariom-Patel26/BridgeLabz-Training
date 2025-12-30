/*11. Temperature Logger 🌡️
Record temperatures over 7 days.
● Use array and for-loop.
● Find average and max temperature.
● Use if for comparisons. Maintain readable naming and modular code blocks.
*/

import java.util.Scanner;
public class TemperatureLogger {
    public static void main (String [] args) {
	Scanner kb = new Scanner (System.in);
        double [] temperature = new double [7];
        
        for (int i = 0 ; i < 7 ; i++) {
            System.out.println("Enter temperature on day "+(i+1));
            // Taking temperature as a input.
	    temperature [i] = kb.nextDouble();
        }

        // calculating average and maximum temperature using for loop.

	double totalSum = 0;
	double maximumTemperature =Integer.MIN_VALUE;
	for (int i = 0 ; i < 7 ; i++) {
	    totalSum+= temperature [i];
	    if (temperature [i]>maximumTemperature) {
		maximumTemperature = temperature[i];
	    }
	}
	double average = totalSum/7;

        // display average temperature and maximum temperature

	System.out.println("average temperature is : "+average);
	System.out.println("maximum temperature is : "+maximumTemperature);
	kb.close();

    }
}