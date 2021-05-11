package Algorithms;

public class ElectronicShop {

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int highestPrice = -1;
        for (int keyboard : keyboards) {
            for (int drive : drives) {
                int price = keyboard + drive;
                if (price <= b && price > highestPrice) {
                    highestPrice = price;
                }
            }
        }
        return highestPrice;
    }
}
