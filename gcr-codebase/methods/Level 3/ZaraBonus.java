public class ZaraBonus {

    // Method to generate salary and service years
    public static double[][] generateEmployeeData() {
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = (int)(Math.random() * 90000) + 10000;
            data[i][1] = (int)(Math.random() * 10) + 1;
        }
        return data;
    }

    // Method to calculate bonus and new salary
    public static double[][] calculateBonus(double[][] data) {
        double[][] result = new double[10][2];
        for (int i = 0; i < 10; i++) {
            double bonus = data[i][1] > 5 ? data[i][0] * 0.05 : data[i][0] * 0.02;
            result[i][0] = bonus;
            result[i][1] = data[i][0] + bonus;
        }
        return result;
    }

    public static void main(String[] args) {
        double[][] emp = generateEmployeeData();
        double[][] updated = calculateBonus(emp);

        double totalOld = 0, totalBonus = 0, totalNew = 0;

        for (int i = 0; i < 10; i++) {
            totalOld += emp[i][0];
            totalBonus += updated[i][0];
            totalNew += updated[i][1];
        }

        System.out.println("Old=" + totalOld + " Bonus=" + totalBonus + " New=" + totalNew);
    }
}