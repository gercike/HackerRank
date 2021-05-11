package DaysOfCode.TwoDArray;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TwoDArrays {
    private static Scanner scanner = null;

    static {
        try {
            scanner = new Scanner(new File("src/HackerRank/TwoDArray/hour.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        int sum = Integer.MIN_VALUE;
        int maxSum = sum;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr[i].length - 2; j++) {
                sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println(maxSum);
        scanner.close();
    }
}
