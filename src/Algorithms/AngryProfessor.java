package Algorithms;

public class AngryProfessor {
    static String angryProfessor(int k, int[] a) {
        int onTimers = 0;
        for (int i : a) {
            if (i <= 0) {
                onTimers++;
            }
        }
        return onTimers >= k ? "NO" : "YES";
    }
}
