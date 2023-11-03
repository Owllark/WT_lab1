package task8;


public class Main {
    public static int[] findIndexes(double[] firstArray, double[] secondArray){
        int[] result = new int[secondArray.length];
        int i = 0;
        int j = 0;
        while (j < secondArray.length) {
            if (i >= firstArray.length - 1 || secondArray[j] <= firstArray[i]){
                result[j] = i;
                j++;
            } else {
                i++;
            }
        }
        return result;
    }

}
