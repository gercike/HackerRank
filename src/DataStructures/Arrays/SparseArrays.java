package DataStructures.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SparseArrays {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(List.of("aba", "bbe", "aba"));
        ArrayList<String> queries = new ArrayList<>(List.of("aba", "lajos", "aba", "bbe"));
        System.out.println(matchingStrings(words, queries));
    }

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        HashMap<String, Integer> stringDensity = new HashMap<>();
        for (int i = 0; i < strings.size(); i++) {
            String letters = strings.get(i);
            if (stringDensity.putIfAbsent(letters, 1) != null) {
                stringDensity.put(letters, stringDensity.get(letters) + 1);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (String query : queries) {
            result.add(stringDensity.getOrDefault(query, 0));
        }
        return result;
    }
}
