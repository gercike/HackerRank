package DaysOfCode.Day25Complexity;

import java.io.FileNotFoundException;

public class RunningTimeAndComplexity {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner s = new Scanner(new File("src/HackerRank/DaysOfCode/Day25Complexity/nums.txt"));
////        Scanner s = new Scanner(System.in);
//        int iters = s.nextInt();
//        for (int i = 0; i < iters; i++) {
//            System.out.println(isPrime(s.nextInt()));
//        }
        System.out.println(isPrime(0));
    }

    static String isPrime(int n) {
        if (n < 2) {
            return "Not prime";
        }
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return "Not prime";
            }
        }
        return "Prime";
    }
}
