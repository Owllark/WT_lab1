package task1;


public class Main {

    public static double calculateExpression(double x, double y) {
        double numerator = 1 + Math.sin(x + y) * Math.sin(x + y);
        return numerator / (2 + Math.abs(x - 2 * x / (1 + x * x * y * y))) + x;
    }

}
