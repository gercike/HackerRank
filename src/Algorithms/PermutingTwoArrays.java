package Algorithms;

import java.util.*;
import java.util.stream.Collectors;

public class PermutingTwoArrays {
    static String twoArrays(int k, int[] A, int[] B) {
        List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());
        list.sort(Collections.reverseOrder());
        Arrays.sort(B);
        for (int i = 0; i < B.length; i++) {
            if (B[i] + list.get(i) < k) {
                return "NO";
            }
        }
        return "YES";
    }
}