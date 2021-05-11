package Algorithms;

import java.util.List;

public class PickingNumbers {
    public static int pickingNumbers(List<Integer> a) {
        int[] numbers = new int[100];
        for (Integer integer : a) {
            numbers[integer] += 1;
        }
        int neighborNumberCount = 0;
        int mostPair = 0;
        for (int number : numbers) {
            if (number == 0) {
                neighborNumberCount = 0;
            } else {
                if (number + neighborNumberCount > mostPair) {
                    mostPair = number + neighborNumberCount;
                }
                neighborNumberCount = number;
            }
        }
        return mostPair;
    }
}
