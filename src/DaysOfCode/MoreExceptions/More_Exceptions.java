package DaysOfCode.MoreExceptions;


import java.util.*;
import java.io.*;

//Write your code here
class NegativeNumberException extends Exception {
    public String getMessage() {
        return "n and p should be non-negative";
    }
}

class Calculator {

    public int power(int n, int p) throws NegativeNumberException {
        if (n < 0 || p < 0) {
            throw new NegativeNumberException();
        } else {
            return (int) Math.pow(n, p);
        }
    }
}

class More_Exceptions {

    public static void main(String[] args) throws FileNotFoundException {
//        Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(new File("src/HackerRank/MoreExceptions/nums.txt"));
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
