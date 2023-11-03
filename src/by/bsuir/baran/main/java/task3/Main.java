package task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        double a = scanner.nextDouble();
        System.out.println("Enter b");
        double b = scanner.nextDouble();
        System.out.println("Enter h");
        double h = scanner.nextDouble();
        double[][] table = calculateTangentWithStep(a,b,h);
        for (double[] row : table) {
            System.out.format("| %.3f | %.3f |\n", row[0], row[1]);
        }
    }
    public static double[][] calculateTangentWithStep(double a, double b, double h){
        int len = (int) Math.abs((b - a) / h) + 1;
        double[][] res = new double[len][2];
        int i = 0;
        for (double x = a; x <= b; x+=h){
            res[i][0] = x;
            res[i][1] = Math.tan(x);
            i++;
        }
        return res;
    }

}
