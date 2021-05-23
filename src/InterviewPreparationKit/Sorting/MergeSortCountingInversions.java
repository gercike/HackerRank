package InterviewPreparationKit.Sorting;

import java.util.List;

public class MergeSortCountingInversions {
    public static long countInversions(List<Integer> arr) {
        return 1;
    }

    /**
     az alábbi buborékrendezés is működik, pontos eredményt ad a számolás, csak lassú
     */
    public static long countInversions_slow(List<Integer> arr) {
        long counter = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) > arr.get(i + 1)) {
                int j = i;
                while (j < arr.size() - 1 && arr.get(j) > arr.get(j + 1)) {
                    int temp1 = arr.remove(j);
                    int temp2 = arr.remove(j);
                    arr.add(j, temp1);
                    arr.add(j, temp2);
                    counter++;
                    j++;
                }
                i = -1;
            }
        }
        return counter;
    }
}
