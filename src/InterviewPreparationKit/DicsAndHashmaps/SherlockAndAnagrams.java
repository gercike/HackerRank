package InterviewPreparationKit.DicsAndHashmaps;

import java.util.HashMap;

public class SherlockAndAnagrams {

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
    }
    public static int sherlockAndAnagrams(String s) {
        int counter = 0;
        HashMap<HashMap<String, Integer>, Integer> hashMap1 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String[] array = s.substring(i, j).split("");
                HashMap<String, Integer> hashMap2 = new HashMap<>();
                for (String letter : array) {
                    hashMap2.putIfAbsent(letter, 0);
                    hashMap2.put(letter, hashMap2.get(letter) + 1);
                }
                hashMap1.putIfAbsent(hashMap2, 0);
                hashMap1.put(hashMap2, hashMap1.get(hashMap2) + 1);
                if (hashMap1.get(hashMap2) > 1) {
                    counter += hashMap1.get(hashMap2) - 1;
                }
            }
        }
        return counter;
    }
}
