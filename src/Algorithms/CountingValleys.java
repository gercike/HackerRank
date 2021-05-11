package Algorithms;

public class CountingValleys {
    public static int countingValleys(int steps, String path) {
        int currentHeight = 0;
        int counter = 0;
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'U') {
                currentHeight++;
            } else {
                currentHeight--;
                if (currentHeight == -1) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
