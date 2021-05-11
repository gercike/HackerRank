package OneDArrayPart2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OneDArray {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("src/HackerRank/OneDArrayPart2/nums.txt"));
        int iter = s.nextInt();
        for (int i = 0; i < iter; i++) {
            int length = s.nextInt();
            int leap = s.nextInt();
            int[] array = new int[length];
            for (int j = 0; j < array.length; j++) {
                array[j] = s.nextInt();
            }
            int pos = 0;
            boolean didntGoBack = true;
            while (pos + leap < array.length) {
                if (array[pos + leap] == 0) {
                    pos = pos + leap;
                    didntGoBack = true;
                } else if (array[pos + 1] == 0 && didntGoBack) {
                    pos = pos + 1;
                } else if (pos > 0 && array[pos - 1] == 0) {
                    pos = pos - 1;
                    didntGoBack = false;
                } else {
                    break;
                }
            }
            if (pos + leap >= array.length) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
