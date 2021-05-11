package Algorithms;

import java.util.Arrays;

public class BreakingTheRecords {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(breakingRecords(new int[]{10, 5, 20, 20, 4, 5, 2, 25, 1})));
    }

    static int[] breakingRecords(int[] scores) {
        int[] result = new int[2];
        int min = scores[0];
        int max = scores[0];
        int counterMax = 0;
        int counterMin = 0;
        for (int score : scores) {
            if (score > max) {
                max = score;
                counterMax++;
            }
            if (score < min) {
                min = score;
                counterMin++;
            }
        }
        result[0] = counterMax;
        result[1] = counterMin;
        return result;
    }
}

