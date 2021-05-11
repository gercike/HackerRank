package Algorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ChiefHopper {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("C:/Users/Gercike/IdeaProjects/HackerRank/files/ChiefHopperCases/testcase9input.txt"));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = chiefHopper(arr);

        System.out.println(result);

        scanner.close();
    }

    static int chiefHopper(int[] arr) {
        int startEnergy = 0;
        int energy = startEnergy;
        for (int i = 0; i < arr.length; ) {
            if (i == 0) {
                energy = startEnergy;
            }
            if (energy > 1000000) {
                energy = 500000;
            }
            if (energy > arr[i]) {
                energy = energy + (energy - arr[i]);
                i++;
                if (energy < 0) {
                    i = 0;
                    startEnergy++;
                }
                continue;
            }
            if (energy < arr[i]) {
                energy = energy - (arr[i] - energy);
                i++;
                if (energy < 0) {
                    i = 0;
                    startEnergy++;
                }
                continue;
            }
            if (energy == arr[i]) {
                i++;
            }
        }
        return startEnergy;
    }
}
