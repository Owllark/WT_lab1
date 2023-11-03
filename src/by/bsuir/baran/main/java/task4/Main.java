package task4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N");
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Enter " + i + " element of array");
            array[i] = scanner.nextInt();
        }
        int[] res = findPrimeElementsIndexes(array);
        for(int n: res){
            System.out.println(n);
        }
    }
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        if(n == 2){
            return true;
        }
        for(int i = 2; i <= n / 2 + 1; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static int[] findPrimeElementsIndexes(int[] arr){
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++){
            if(isPrime(arr[i])){
                indexes.add(i);
            }
        }
        int[] res = new int[indexes.size()];
        for(int i = 0; i < indexes.size(); i++){
            res[i] = indexes.get(i);
        }
        return res;
    }

}
