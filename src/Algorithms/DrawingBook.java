package Algorithms;

public class DrawingBook {

    static int pageCount(int n, int p) {
        return p <= Math.abs(n - p) ? p / 2 : (((n - p) / 2) == 0 && n % 2 == 0 && n != p) ? 1 : (n - p) / 2;
    }
}
