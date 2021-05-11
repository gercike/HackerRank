package Algorithms;

public class SaveThePrisoner {
    //    n: number of prisoners
//    m: number of candies
//    s: number of starting seat
    static int saveThePrisoner(int n, int m, int s) {
        int numberToCountWith = m % n;
        if (numberToCountWith == 0) {
            numberToCountWith = n;
        }
        int seatNumberThatGetsLast = s + numberToCountWith - 1;
        if (seatNumberThatGetsLast < 1) {
            if (n - 1 == 0) {
                return n - seatNumberThatGetsLast;
            }
            return n - 1 - seatNumberThatGetsLast;
        }
        if (seatNumberThatGetsLast > n) {
            return seatNumberThatGetsLast - n;
        }
        return seatNumberThatGetsLast;
    }
}
