package SubarrayII;

import java.util.ArrayList;
import java.util.Scanner;

public class SubarrayII {
    public static void main(String[] args) {
//        Scanner s = new Scanner(new File("src/HackerRank/SubarrayII/numbers.txt"));
        Scanner s = new Scanner(System.in);
        ArrayList<int[]> lists = new ArrayList<>();
        int iter = s.nextInt();
        for (int i = 0; i < iter; i++) {
            int[] array = new int[s.nextInt()];
            for (int j = 0; j < array.length; j++) {
                array[j] = s.nextInt();
            }
            lists.add(array);
        }
        int iter2 = s.nextInt();
        for (int i = 0; i < iter2; i++) {
            int arrayIdx = s.nextInt() - 1;
            int elementIdx = s.nextInt() - 1;
            if (arrayIdx < lists.size() && arrayIdx >= 0) {
                if (elementIdx < lists.get(arrayIdx).length && elementIdx >= 0) {
                    System.out.println(lists.get(arrayIdx)[elementIdx]);
                } else {
                    System.out.println("ERROR!");
                }
            } else {
                System.out.println("ERROR!");
            }
        }
    }
}
