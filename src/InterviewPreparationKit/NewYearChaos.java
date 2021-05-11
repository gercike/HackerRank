package InterviewPreparationKit;

import java.util.List;

public class NewYearChaos {
    public static int minimumBribes(List<Integer> q) {
        int sum = 0;
        for (int i = q.size() - 1; i >= 0; i--) {
            int number = q.get(i);
            if (number > i + 3) {
                return -1;
//                System.out.println("Too chaotic"); return;
            }
            for (int j = i - 1; j >= 0 && j >= number - 2; j--) {
                if (q.get(j) > number) {
                    sum += 1;
                }
            }
        }
//        System.out.println(sum);
        return sum;
    }
}
