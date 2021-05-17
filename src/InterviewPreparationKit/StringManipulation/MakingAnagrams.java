package InterviewPreparationKit.StringManipulation;

import java.util.Arrays;
import java.util.Collections;

public class MakingAnagrams {
    public static int makeAnagram(String a, String b) {
        char[] arrayA = a.toCharArray();
        Arrays.sort(arrayA);
        char[] arrayB = b.toCharArray();
        Arrays.sort(arrayB);
        char[] shorter = arrayA.length <= arrayB.length ? arrayA : arrayB;
        char[] longer = arrayA.length > arrayB.length ? arrayA : arrayB;
        int longerIdx = 0;
        int counter = 0;
        for (int i = 0; i < shorter.length; i++) {
            boolean hasPair = false;
            while (longerIdx < longer.length) {
                if (longer[longerIdx] == shorter[i]) {
                    longerIdx++;
                    hasPair = true;
                    break;
                }
                if (longer[longerIdx] < shorter[i]) {
                    longerIdx++;
                    counter++;
                    continue;
                }
                if (longer[longerIdx] > shorter[i]) {
                    break;
                }
            }
            if (!hasPair) {
                counter++;
            }
        }
        counter += longer.length - longerIdx;
        return counter;
    }
}
