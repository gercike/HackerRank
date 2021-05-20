package InterviewPreparationKit.StringManipulation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SherlockAndTheValidString {
    public static void main(String[] args) {
        isValid("alaz");
    }

    public static String isValid(String s) {
        int[] letters = new int[26];
        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - 97] += 1;
        }
        HashSet<Integer> counts = new HashSet<>();
        HashMap<Integer, Integer> frequencies = new HashMap<>();
        for (int letter : letters) {
            if (letter != 0) {
                counts.add(letter);
                frequencies.putIfAbsent(letter, 0);
                frequencies.put(letter, frequencies.get(letter) + 1);
            }
        }
        System.out.println(frequencies);
        if (counts.size() > 2) {
            return "NO";
        } else if (counts.size() == 1) {
            return "YES";
        } else if (counts.size() == 2) {
            if (frequencies.containsKey(1) && frequencies.get(1) == 1) {
                return "YES";
            }
            if (frequencies.containsValue(1)) {
                int soloFrequency = 0;
                int multipleFreq = 0;
                for (Map.Entry<Integer, Integer> integerIntegerEntry : frequencies.entrySet()) {
                    if (integerIntegerEntry.getValue() == 1) {
                        soloFrequency = integerIntegerEntry.getKey();
                    }
                    if (integerIntegerEntry.getValue() != 1) {
                        multipleFreq = integerIntegerEntry.getKey();
                    }
                }
                return soloFrequency - multipleFreq == 1 ? "YES" : "NO";
            }
        }
        return "NO";
    }
}
