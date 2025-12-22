import java.util.Scanner;
public class QuadraticEquation {

    // Find roots of quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            return new double[0];
        }
        if (delta == 0) {
            return new double[]{ -b / (2 * a) };
        }
        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);

        return new double[]{ root1, root2 };
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] roots = findRoots(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        for (double r : roots) {
            System.out.println(r);
        }
        sc.close();
    }
}
