package InterviewPreparationKit.GreedyAlgorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumAbsoluteDifferenceInAnArray {
    public static int minimumAbsoluteDifference(List<Integer> arr) {
        Collections.sort(arr);
        int mininumDiff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i + 1) - arr.get(i) < mininumDiff) {
                mininumDiff = arr.get(i + 1) - arr.get(i);
            }
        }
        return mininumDiff;
    }
}
