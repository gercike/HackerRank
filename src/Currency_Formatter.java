import com.sun.jdi.LocalVariable;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Currency_Formatter {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double payment = scanner.nextDouble();
        double payment = 12324.134;

//        scanner.close();
        NumberFormat first = NumberFormat.getCurrencyInstance(Locale.US);
        String us = first.format(payment);
        Locale INDIA = new Locale ("en", "IN");
        NumberFormat second = NumberFormat.getCurrencyInstance(INDIA);
        String india = second.format(payment);
        NumberFormat third = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = third.format(payment);
        NumberFormat fourth = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = fourth.format(payment);

        // Write your code here.

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
