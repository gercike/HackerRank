package InterviewPreparationKit.ArrayManip;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayManipulation {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/InterviewPreparationKit/ArrayManip/array.txt"));
        // array helyes megoldás: 7542539201
        // array2 helyes megoldás: 8628
        String[] nm = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[][] queries = new int[m][3];
        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }
        long result = arrayManipulation(n, queries);
        scanner.close();
        System.out.println(result);
    }

    public static long arrayManipulation(int n, int[][] queries) {
        int[] array = new int[n];
        for (int i = 0; i < queries.length; i++) {
            array[queries[i][0] - 1] += queries[i][2];
            if (queries[i][1] < array.length) {
                array[queries[i][1]] -= queries[i][2];
            }
        }
        long max = 0;
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (sum > max){
                max = sum;
            }
        }
        return max;
    }

    static long arrayManipulation_fastButWrong(int n, int[][] queries) {
        Arrays.sort(queries, new Comparator<int[]>() {
            @Override
            public int compare(int[] t1, int[] t2) {
                if (t1[0] == t2[0]) {
                    return t1[1] - t2[1];
                }
                return t1[0] - t2[0];
            }
        });
        System.out.println(Arrays.deepToString(queries));
        long finalMax = 0;
        long max = 0;
        for (int i = 0; i < queries.length; i++) {
            int end = queries[i][1];
            max = queries[i][2];
            for (int k = i + 1; k < queries.length && i < queries.length - 1 && queries[k][0] <= end; k++) {
                if (queries[k][1] < end) {
                    end = queries[k][1];
                }
                max += queries[k][2];
                if (max > finalMax) {
                    finalMax = max;
                }
            }
        }
        return finalMax;
    }

    static long arrayManipulation_slow(int n, int[][] queries) {
        long max = Long.MIN_VALUE;
        long[] array = new long[n];
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0] - 1; j <= queries[i][1] - 1; j++) {
                array[j] += queries[i][2];
                if (array[j] > max) {
                    max = array[j];
                }
            }
            System.out.println(Arrays.toString(array));
        }
        return max;
    }
}
