package InterviewPreparationKit.DicsAndHashmaps;

import java.io.*;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class CountTriplets {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/InterviewPreparationKit/DicsAndHashmaps/count.txt")); //result should be: 2325652489
        String[] nr = scanner.nextLine().replaceAll("\\s+$", "").split(" ");
        int n = Integer.parseInt(nr[0]);
        long r = Long.parseLong(nr[1]);
        List<Long> arr = Stream.of(scanner.nextLine().replaceAll("\\s+$", "").split(" "))
                .map(Long::parseLong)
                .collect(toList());
        long ans = countTriplets(arr, r);
        System.out.println(ans);
        scanner.close();
    }

    static long countTriplets(List<Long> arr, long r) {
        HashMap<Long, Long> firsts = new HashMap<>();
        HashMap<Long, Long> seconds = new HashMap<>();
        long triplets = 0;
        for (int i = 0; i < arr.size(); i++) {
            long number = arr.get(i);
            if (number % r == 0) {
                if (i > 1 && seconds.containsKey(number / r)) {
                    triplets += seconds.get(number / r);
                }
                if (i > 0 && i < arr.size() - 1 && firsts.containsKey(number / r)) {
                    seconds.putIfAbsent(number, 0L);
                    seconds.put(number, seconds.get(number) + firsts.get(number / r));
                }
            }
            if (i < arr.size() - 2) {
                firsts.putIfAbsent(number, 0L);
                firsts.put(number, firsts.get(number) + 1);
            }
        }
        return triplets;
    }

    static long countTriplets_wrong(List<Long> arr, long r) {
        long counter = 0;
        HashMap<Long, Integer> hashMap = new HashMap<>();
        for (Long aLong : arr) {
            hashMap.putIfAbsent(aLong, 0);
            hashMap.put(aLong, hashMap.get(aLong) + 1);
        }
        for (long number : hashMap.keySet()) {
            if (hashMap.containsKey(number / r) && hashMap.containsKey(number / r / r)) {
                counter += (long) hashMap.get(number) * (long) hashMap.get(number / r) * (long) hashMap.get(number / r / r);
            }
        }
        System.out.println(hashMap);
        return counter;
    }

    static long countTriplets_slow(List<Long> arr, long r) {
        long counter = 0;
        for (int i = 0; i < arr.size() - 2; i++) {
            long multi1 = arr.get(i) * r;
            for (int j = i + 1; j < arr.size() - 1 && arr.get(j) <= multi1; j++) {
                if (arr.get(j) == multi1) {
                    long multi2 = arr.get(j) * r;
                    for (int k = j + 1; k < arr.size() && arr.get(k) <= multi2; k++) {
                        if (arr.get(k) == multi2) {
                            counter++;
                        }
                    }
                }
            }
        }
        return counter;
    }
}
