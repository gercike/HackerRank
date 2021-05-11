package InterviewPreparationKit.DicsAndHashmaps;

import java.util.Arrays;
import java.util.HashSet;

public class TwoStrings {

    public static String twoStrings(String s1, String s2) {
        String[] array = s1.split("");
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(array));
        System.out.println(hashSet);
        for (int i = 0; i < s2.length(); i++) {
            if (hashSet.contains(s2.substring(i, i + 1))) {
                return "YES";
            }
        }
        return "NO";
    }
}
