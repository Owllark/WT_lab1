package task7;

public class Main {

    public static double[] sort(double[] arr){
        int i = 0;
        while (i < arr.length - 1){
            if(arr[i] > arr[i + 1]){
                double tmp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = tmp;
                i--;
                i = i == -1 ? 0 : i;
            }
            else{
                i++;
            }
        }
        return arr;
    }
}
