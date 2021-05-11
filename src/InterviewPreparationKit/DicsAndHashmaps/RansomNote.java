package InterviewPreparationKit.DicsAndHashmaps;

import java.util.HashMap;
import java.util.List;

public class RansomNote {
    public static void main(String[] args) {
        long n1 = 44;
        long n2 = 7;
        System.out.println(n1 / (double)n2);
    }

    public static int checkMagazine(List<String> magazine, List<String> note) {
        // Write your code here
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String s : magazine) {
            hashMap.putIfAbsent(s, 0);
            hashMap.put(s, hashMap.get(s) + 1);
        }
        for (String s : note) {
            if (hashMap.get(s) != null && hashMap.get(s) > 0) {
                hashMap.put(s, hashMap.get(s) - 1);
            } else {
//                System.out.println("No"); return;
                return -1;
            }
        }
//        System.out.println("Yes");
        return 1;
    }
}
