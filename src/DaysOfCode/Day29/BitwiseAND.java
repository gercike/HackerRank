package DaysOfCode.Day29;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BitwiseAND {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/HackerRank/DaysOfCode/Day29/nums.txt"));
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");
            int n = Integer.parseInt(nk[0]);
            int[] array = makeArray(n);
            int k = Integer.parseInt(nk[1]);
            System.out.println(findRelativeMaxInArray(array, k));
        }
        scanner.close();
    }

    static int findRelativeMaxInArray(int[] array, int k) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            int j = i + 1;
            while (j < array.length) {
                int and = array[i] & array[j];
                if (and > max && and < k) {
                    max = (array[i] & array[j]);
                }
                j++;
            }
        }
        return max;
    }

    static int[] makeArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }
        return array;
    }
}
