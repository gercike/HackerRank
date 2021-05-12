package InterviewPreparationKit.DicsAndHashmaps;

import java.util.*;

public class FrequencyQueries {
    static List<Integer> freqQuery(List<List<Integer>> queries) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (List<Integer> query : queries) {
            int number = query.get(1);
            switch (query.get(0)) {
                case 1:
                    hashMap.putIfAbsent(number, 0);
                    hashMap.put(number, hashMap.get(number) + 1);
                    int newFreq = hashMap.get(number);
                    freqMap.putIfAbsent(newFreq, 0);
                    freqMap.put(newFreq, freqMap.get(newFreq) + 1);
                    if (newFreq > 1) {
                        freqMap.put(newFreq - 1, freqMap.get(newFreq - 1) - 1);
                    }
                    break;
                case 2:
                    if (hashMap.containsKey(number)) {
                        int oldFreq = hashMap.get(number);
                        hashMap.put(number, oldFreq - 1);
                        freqMap.put(oldFreq, freqMap.get(oldFreq) - 1);
                        if (oldFreq == 1) {
                            hashMap.remove(number);
                        } else {
                            freqMap.put(oldFreq - 1, freqMap.get(oldFreq - 1) + 1);
                        }
                    }
                    break;
                case 3:
                    result.add(freqMap.containsKey(number) && freqMap.get(number) != 0 ? 1 : 0);
            }
        }
        return result;
    }

    static List<Integer> freqQuery_slow(List<List<Integer>> queries) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (List<Integer> query : queries) {
            int number = query.get(1);
            switch (query.get(0)) {
                case 1:
                    hashMap.putIfAbsent(number, 0);
                    hashMap.put(number, hashMap.get(number) + 1);
                    break;
                case 2:
                    if (hashMap.containsKey(number) && hashMap.get(number) > 0) {
                        hashMap.put(number, hashMap.get(number) - 1);
                    }
                    break;
                case 3:
                    if (hashMap.containsValue(number)) {
                        result.add(1);
                    } else {
                        result.add(0);
                    }
            }
        }
        return result;
    }
}
