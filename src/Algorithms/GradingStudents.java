package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {
    public static void main(String[] args) {
        System.out.println(gradingStudents(new ArrayList<>(Arrays.asList(73, 67, 38, 33))));
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> list = new ArrayList<>();
        for (Integer grade : grades) {
            if (grade > 37) {
                list.add(roundToTheClosestMultipleOfFive(grade));
            } else {
                list.add(grade);
            }
        }
        return list;
    }

    static int roundToTheClosestMultipleOfFive(int n) {
        int left = n % 5;
        if (left > 2) {
            n = n + 5 - left;
            return n;
        }
        return n;
    }
}
