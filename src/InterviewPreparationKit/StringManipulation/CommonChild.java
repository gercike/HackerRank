package InterviewPreparationKit.StringManipulation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CommonChild {
    public static int commonChild(String s1, String s2) {
        HashSet<Character> lettersOfFirst = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            lettersOfFirst.add(s1.charAt(i));
        }
        List<Character> lettersS1 = new ArrayList<>();
        List<Character> lettersS2 = new ArrayList<>();
        HashSet<Character> lettersOfSecond = new HashSet<>();
        for (int i = 0; i < s2.length(); i++) {
            if (lettersOfFirst.contains(s2.charAt(i))) {
                lettersS2.add(s2.charAt(i));
            }
            lettersOfSecond.add(s2.charAt(i));
        }
        for (int i = 0; i < s1.length(); i++) {
            if (lettersOfSecond.contains(s1.charAt(i))) {
                lettersS1.add(s1.charAt(i));
            }
        }
        List<Character> shorter = lettersS1.size() <= lettersS2.size() ? lettersS1 : lettersS2;
        List<Character> longer = lettersS1.size() > lettersS2.size() ? lettersS1 : lettersS2;
        int longest = 0;
        int same = 0;
        for (int i = 0; i < shorter.size(); i++) {
            int i2 = i;
            for (int j = 0; j < longer.size() && i2 < shorter.size(); j++) {
                if (shorter.get(i2) == longer.get(j)) {
                    i2++;
                    same++;
                } else {
                    if (same > longest) {
                        longest = same;
                    }
                    i2 = i;
                    same = 0;
                }
            }
        }
        System.out.println(lettersS1);
        System.out.println(lettersS2);
        return longest;
    }
}
