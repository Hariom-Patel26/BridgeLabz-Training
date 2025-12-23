import java.util.Scanner;
class BMIProgram {

    // Method to calculate BMI and status
    static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[10][4];
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightM = data[i][1] / 100;
            double bmi = weight / (heightM * heightM);
            String status;
            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 25) status = "Normal";
            else if (bmi < 30) status = "Overweight";
            else status = "Obese";
            result[i][0] = String.valueOf(data[i][1]);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    // Method to display BMI table
    static void display(String[][] arr) {
        System.out.println("Height\tWeight\tBMI\tStatus"); // print
        for (String[] row : arr) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2] + "\t" + row[3]); // print
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight and height: "); // input
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }

        String[][] result = calculateBMI(data);
        display(result);
    }
}
