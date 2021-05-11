package InterviewPreparationKit;

import java.util.List;

public class JumpingOnTheClouds {
    public static int jumpingOnClouds(List<Integer> c) {
        int counter = 0;
        return recursive(c, 0, counter);
    }

    public static int recursive(List<Integer> c, int position, int counter) {
        if (position == c.size() - 1) {
            return counter;
        }
        if (c.get(position) == 1) {
            return counter + 1000;
        } else {
            if (position <= c.size() - 3) {
                counter++;
                return Math.min(recursive(c, position + 1, counter), recursive(c, position + 2, counter));
            } else {
                counter++;
                return recursive(c, position + 1, counter);
            }
        }
    }
}
