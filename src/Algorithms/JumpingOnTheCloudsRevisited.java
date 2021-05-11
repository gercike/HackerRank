package Algorithms;

public class JumpingOnTheCloudsRevisited {
    static int jumpingOnClouds(int[] c, int k) {
        int energy = 100;
        int startIdx;
        int targetIdx = k % c.length;
        do {
            energy--;
            if (c[targetIdx] == 1) {
                energy -= 2;
            }
            startIdx = targetIdx;
            targetIdx = (startIdx + k) % c.length;
        }
        while (startIdx != 0);
        return energy;
    }
}
