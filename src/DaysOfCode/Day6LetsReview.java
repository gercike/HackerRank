package DaysOfCode;

import java.util.Scanner;

public class Day6LetsReview {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.nextLine();
        while (s.hasNextLine()) {
            char[] line = s.nextLine().toCharArray();
            for (int i = 0; i < line.length; i += 2) {
                System.out.print(line[i]);
            }
            System.out.print(" ");
            for (int i = 1; i < line.length; i += 2) {
                System.out.print(line[i]);
            }
            System.out.println();
        }
    }
}
