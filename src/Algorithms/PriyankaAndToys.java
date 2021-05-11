package Algorithms;

import java.util.Arrays;

public class PriyankaAndToys {
    static int toys(int[] w) {
        Arrays.sort(w);
        int numberOfContainersNeeded = 1;
        int weightLimit = w[0] + 4;
        for (int i : w) {
            if (i > weightLimit) {
                weightLimit = i + 4;
                numberOfContainersNeeded++;
            }
        }
        return numberOfContainersNeeded;
    }
}
