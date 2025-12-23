public class StudentScorecard {
    static int[][] generateScores(int n) {
        int[][] s = new int[n][3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                s[i][j] = (int)(Math.random() * 100);
        return s;
    }
    static String grade(double p) {
        if (p >= 90) return "A";
        if (p >= 75) return "B";
        if (p >= 60) return "C";
        return "D";
    }

    public static void main(String[] args) {
        int[][] s = generateScores(5);
        System.out.println("Phy Chem Math Total % Grade");

        for (int i = 0; i < s.length; i++) {
            int total = s[i][0] + s[i][1] + s[i][2];
            double perc = Math.round((total / 3.0) * 100) / 100.0;
            System.out.println(s[i][0]+" "+s[i][1]+" "+s[i][2]+" "+total+" "+perc+" "+grade(perc));
        }
    }
}
