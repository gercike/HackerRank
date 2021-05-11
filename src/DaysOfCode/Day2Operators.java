package DaysOfCode;

import java.util.*;

public class Day2Operators {
    private static final Scanner scanner = new Scanner(System.in);

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = meal_cost * tip_percent / 100;
        double tax = meal_cost * tax_percent / 100;
        double totalCost = meal_cost + tip + tax;
        int roundCost = totalCost % (int) totalCost < 0.50 ? (int) totalCost : (int) totalCost + 1;
        System.out.println(roundCost);
    }

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}