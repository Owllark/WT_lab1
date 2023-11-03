package task5;

public class Main {

    public static int findLeastNumberOfElements(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return 0;
        }

        int[] maxSeqLen = new int[n];
        int maxLen = 1;

        for (int i = 0; i < n; i++) {
            maxSeqLen[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    maxSeqLen[i] = Math.max(maxSeqLen[i], maxSeqLen[j] + 1);
                }
            }
            maxLen = Math.max(maxLen, maxSeqLen[i]);
        }

        return n - maxLen;
    }

}
