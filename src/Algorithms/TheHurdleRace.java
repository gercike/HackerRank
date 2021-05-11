package Algorithms;

public class TheHurdleRace {
    static int hurdleRace(int k, int[] height) {
        int jumpNeeded = 0;
        for (int i : height) {
            if (i - k > jumpNeeded) {
                jumpNeeded = i - k;
            }
        }
        return jumpNeeded;
    }
}
