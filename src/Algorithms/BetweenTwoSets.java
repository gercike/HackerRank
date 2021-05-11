package Algorithms;

import java.util.List;

public class BetweenTwoSets {

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int counter = 0;
        int maxInA = 0;
        for (Integer integer : a) {
            if (integer > maxInA) {
                maxInA = integer;
            }
        }
        int minInB = 100;
        for (Integer integer : b) {
            if (integer < minInB) {
                minInB = integer;
            }
        }
        for (int i = maxInA; i <= minInB; i++) {
            for (int j = 0; j < a.size(); j++) {
                if (!(i % a.get(j) == 0)) {
                    break;
                }
                if (j == a.size() - 1) {
                    for (int k = 0; k < b.size(); k++) {
                        if (!(b.get(k) % i == 0)) {
                            break;
                        }
                        if (k == b.size() - 1) {
                            counter++;
                        }
                    }
                }
            }
        }
        return counter;
    }
}
