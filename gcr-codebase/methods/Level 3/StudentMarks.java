public class StudentMarks {

    // Method to generate PCM scores
    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = (int)(Math.random() * 90) + 10;
            scores[i][1] = (int)(Math.random() * 90) + 10;
            scores[i][2] = (int)(Math.random() * 90) + 10;
        }
        return scores;
    }

    // Method to calculate total, average and percentage
    public static double[][] calculateResults(int[][] scores) {
        double[][] result = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2];
            result[i][0] = total;
            result[i][1] = Math.round((total / 3) * 100.0) / 100.0;
            result[i][2] = Math.round((total / 300) * 10000.0) / 100.0;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] scores = generateScores(3);
        double[][] result = calculateResults(scores);

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] +"\t" + result[i][0] + "\t" + result[i][1] + "\t" + result[i][2]);
        }
    }
}