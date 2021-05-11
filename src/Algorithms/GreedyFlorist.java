package Algorithms;

import java.util.Arrays;

public class GreedyFlorist {
    static int getMinimumCost(int numberOfPersons, int[] prices) {
        Arrays.sort(prices);
        int finalCost = 0;
        for (int i = prices.length - 1, multiplier = 1, counter = 1; i >= 0; i--, counter++) {
            finalCost += (multiplier * prices[i]);
            if (counter == numberOfPersons) {
                multiplier++;
                counter = 0;
            }
        }
        return finalCost;
    }
}
