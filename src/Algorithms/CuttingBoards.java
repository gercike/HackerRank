package Algorithms;

import java.util.Arrays;
import java.io.*;
import java.util.*;

public class CuttingBoards {

//    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("C:/Users/Gercike/IdeaProjects/HackerRank/files/CuttingBoardsTests/test7input.txt"));

//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] mn = scanner.nextLine().split(" ");

            int m = Integer.parseInt(mn[0]);

            int n = Integer.parseInt(mn[1]);

            int[] cost_y = new int[m - 1];

            String[] cost_yItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < m - 1; i++) {
                int cost_yItem = Integer.parseInt(cost_yItems[i]);
                cost_y[i] = cost_yItem;
            }

            int[] cost_x = new int[n - 1];

            String[] cost_xItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n - 1; i++) {
                int cost_xItem = Integer.parseInt(cost_xItems[i]);
                cost_x[i] = cost_xItem;
            }

            int result = boardCutting(cost_y, cost_x);
            System.out.println(result);

//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
        }

//        bufferedWriter.close();

        scanner.close();
    }

    static int boardCutting(int[] cost_y, int[] cost_x) {
        Arrays.sort(cost_x);
        Arrays.sort(cost_y);
        long yMultiplier = 1;
        long xMultiplier = 1;
        long finalCost = 0;
        for (int yIdx = cost_y.length - 1, xIdx = cost_x.length - 1; yIdx >= 0 || xIdx >= 0; ) {
            if (xIdx < 0) {
                finalCost += cost_y[yIdx] * yMultiplier;
                xMultiplier++;
                yIdx--;
                continue;
            }
            if (yIdx < 0) {
                finalCost += cost_x[xIdx] * xMultiplier;
                yMultiplier++;
                xIdx--;
                continue;
            }
            if (cost_x[xIdx] >= cost_y[yIdx]) {
                finalCost += cost_x[xIdx] * xMultiplier;
                yMultiplier++;
                xIdx--;
            } else {
                finalCost += cost_y[yIdx] * yMultiplier;
                xMultiplier++;
                yIdx--;
            }
        }
        return (int)(finalCost % (long) (Math.pow(10, 9) + 7));
    }
}
