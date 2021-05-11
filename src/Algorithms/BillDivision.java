package Algorithms;

import java.util.Arrays;
import java.util.List;

public class BillDivision {
    public static void main(String[] args) {
        bonAppetit(Arrays.asList(3, 10, 2, 9), 1, 12);
        bonAppetit(Arrays.asList(3, 10, 2, 9), 1, 7);
    }

    static void bonAppetit(List<Integer> bill, int k, int b) {
        int sum = 0;
        for (int i = 0; i < bill.size(); i++) {
            if (i == k) {
                continue;
            }
            sum += bill.get(i);
        }
        if (sum / 2 == b) {
            System.out.println("Bon Appetit");
            return;
        }
        System.out.println(b - sum / 2);
    }
}
