package InterviewPreparationKit.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(1);
        countSwaps(list);
    }

    public static void countSwaps(List<Integer> a) {
        int counter = 0;
        for (int i = 0; i < a.size() - 1; i++) {
            if (a.get(i) > a.get(i + 1)) {
                int j = i;
                while (j < a.size() - 1 && a.get(j) > a.get(j + 1)) {
                    int temp1 = a.remove(j);
                    int temp2 = a.remove(j);
                    a.add(j, temp1);
                    a.add(j, temp2);
                    counter++;
                    j++;
                }
                i = -1;
            }
        }
        System.out.println("Array is sorted in " + counter + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(a.size() - 1));
    }
}
