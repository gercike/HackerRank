package Algorithms;

import java.util.Arrays;

public class MaxMin {
    static int maxMin(int targetLength, int[] arr) {
        Arrays.sort(arr);
        int minUnfairness = Integer.MAX_VALUE;
        for (int i = 0; i <= arr.length - targetLength; i++) {
            if (minUnfairness > arr[i + targetLength - 1] - arr[i]) {
                minUnfairness = arr[i + targetLength - 1] - arr[i];
            }
        }
        return minUnfairness;
    }
}
