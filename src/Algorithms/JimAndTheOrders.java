package Algorithms;

import java.util.Arrays;
import java.util.Comparator;

public class JimAndTheOrders {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(jimOrders(new int[][]{{8, 1}, {4, 2}, {5, 6}, {3, 1}, {4, 3}})));
    }

    static int[] jimOrders(int[][] orders) {
        int[][] orderOfDelivery = new int[orders.length][orders[0].length];
        for (int i = 0; i < orders.length; i++) {
            int deliveryTime = 0;
            for (int j = 0; j < orders[i].length; j++) {
                deliveryTime += orders[i][j];
            }
            orderOfDelivery[i][0] = i + 1;
            orderOfDelivery[i][1] = deliveryTime;
        }
        Arrays.sort(orderOfDelivery, new Comparator<int[]>() {
            @Override
            public int compare(int[] t1, int[] t2) {
                return t1[1] - t2[1];
            }
        });
        int[] result = new int[orderOfDelivery.length];
        for (int i = 0; i < orderOfDelivery.length; i++) {
            result[i] = orderOfDelivery[i][0];
        }
        return result;
    }
}
