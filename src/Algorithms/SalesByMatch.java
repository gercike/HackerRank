package Algorithms;

import java.util.Arrays;

public class SalesByMatch {

    static int sockMerchant(int n, int[] ar) {
        Arrays.sort(ar);
        int partOfPair = 1;
        int counter = 0;
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] != ar[i - 1]) {
                partOfPair = 1;
            } else {
                partOfPair++;
                if (partOfPair == 2) {
                    counter++;
                    partOfPair = 0;
                }
            }
        }
        return counter;
    }
}
