package Algorithms;

import java.util.List;

public class SubarrayDivision {

    static int birthday(List<Integer> s, int d, int m) {
        int counter = 0;
        for (int i = 0; i < s.size(); i++) {
            int sum = 0;
            if (i <= s.size() - m) {
                for (int j = i, k = 0; k < m; j++, k++) {
                    sum += s.get(j);
                }
                if (sum == d) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
