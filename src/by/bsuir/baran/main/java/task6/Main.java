package task6;

public class Main {
    public static double[][] changeMatrix(double[] arr){
        double[][] result = new double[arr.length][arr.length];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                result[i][j] = arr[(i + j) % arr.length];
            }
        }
        return result;
    }
}
