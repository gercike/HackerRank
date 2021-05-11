package Algorithms;

import java.util.List;

public class MigratoryBirds {

    static int migratoryBirds(List<Integer> arr) {
        int[] birds = new int[arr.size()];
        for (Integer integer : arr) {
            birds[integer] += 1;
        }
        int max = 0;
        int idx = 0;
        for (int i = 0; i < birds.length; i++) {
            if (birds[i] > max) {
                max = birds[i];
                idx = i;
            }
        }
        return idx;
    }
}
