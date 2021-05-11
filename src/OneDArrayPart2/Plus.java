package OneDArrayPart2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Plus {
    public static boolean canWin(int leap, int[] game) {
        int pos = 0;
        boolean didntGoBack = true;
        while (pos + leap < game.length) {
            if (game[pos + leap] == 0) {
                pos = pos + leap;
                didntGoBack = true;
            } else if (game[pos + 1] == 0 && didntGoBack) {
                pos = pos + 1;
            } else if (pos > 0 && game[pos - 1] == 0) {
                pos = pos - 1;
                didntGoBack = false;
            } else {
                break;
            }
        }
        if (pos + leap >= game.length) {
            return true;
        } else {
            return false;
        }
        // Return true if you can win the game; otherwise, return false.
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("src/HackerRank/OneDArrayPart2/nums.txt"));

//        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }


//        Scanner s = new Scanner(new File("src/HackerRank/OneDArrayPart2/nums.txt"));
//        int iter = s.nextInt();
//        for (int i = 0; i < iter; i++) {
//            int length = s.nextInt();
//            int leap = s.nextInt();
//            int[] array = new int[length];
//            for (int j = 0; j < array.length; j++) {
//                array[j] = s.nextInt();
//            }
//            int pos = 0;
//            boolean didntGoBack = true;
//            while (pos + leap < array.length) {
//                if (array[pos + leap] == 0) {
//                    pos = pos + leap;
//                    didntGoBack = true;
//                } else if (array[pos + 1] == 0 && didntGoBack) {
//                    pos = pos + 1;
//                } else if (pos > 0 && array[pos - 1] == 0) {
//                    pos = pos - 1;
//                    didntGoBack = false;
//                } else {
//                    break;
//                }
//            }
//            if (pos + leap >= array.length) {
//                System.out.println("YES");
//            } else {
//                System.out.println("NO");
//            }
//        }

}
