public class RandomStatistics {
    // Generate random 4-digit numbers
    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 9000) + 1000;
        }
        return arr;
    }
    // Find average, minimum and maximum
    public static double[] findAverageMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        int sum = 0;

        for (int n : arr) {
            sum += n;
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        return new double[]{ (double) sum / arr.length, min, max };
    }
    public static void main(String[] args) {
        int[] arr = generateRandomArray(5);
        double[] result = findAverageMinMax(arr);

        System.out.println("Avg=" + result[0] + " Min=" + result[1] + " Max=" + result[2]);
    }
}
