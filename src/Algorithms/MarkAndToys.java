package Algorithms;

import java.util.Arrays;

public class MarkAndToys {
    static int maximumToys(int[] prices, int budget) {
        Arrays.sort(prices);
        int cost = 0;
        int pieces = 0;
        for (int price : prices) {
            if (cost + price <= budget) {
                pieces++;
                cost += price;
            } else {
                break;
            }
        }
        return pieces;
    }
}
