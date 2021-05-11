package JavaLoopsII;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String[] argh) throws FileNotFoundException {
//        Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(new File("src/HackerRank/JavaLoopsII/JavaLoopsII.txt"));
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j = 0; j < n; j++) {
                System.out.print((a += Math.pow(2, j) * b) + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
