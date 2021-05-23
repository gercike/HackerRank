package InterviewPreparationKit.GreedyAlgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LuckBalance {
    public static int luckBalance(int k, List<List<Integer>> contests) {
        int luck = 0;
        List<Integer> importantContests = new ArrayList<>();
        for (List<Integer> contest : contests) {
            if (contest.get(1) == 1) {
                importantContests.add(contest.get(0));
            } else {
                luck += contest.get(0);
            }
        }
        Collections.sort(importantContests);
        for (int i = importantContests.size() - 1; i >= 0; i--) {
            if (k > 0) {
                luck += importantContests.get(i);
                k--;
            } else {
                luck -= importantContests.get(i);
            }
        }
        return luck;
    }
}
