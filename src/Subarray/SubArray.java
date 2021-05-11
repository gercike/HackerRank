package Subarray;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner s = new Scanner(new File("src/HackerRank/Subarray/numbers.txt"));
        Scanner s = new Scanner(System.in);
        int[] numbers = new int[Integer.parseInt(s.next())];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(s.next());
        }
        int counter = 0;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                sum += numbers[j];
                if (sum < 0) {
                    counter++;
                }
            }
            sum = 0;
        }
        System.out.println(counter);
    }
}
