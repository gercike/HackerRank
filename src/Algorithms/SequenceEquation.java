package Algorithms;

public class SequenceEquation {
    static int[] permutationEquation(int[] p) {
        int[] result = new int[p.length];
        for (int i = 0; i < p.length; i++) {
            result[p[i]] = p[i];
        }
        return result;
    }
}
