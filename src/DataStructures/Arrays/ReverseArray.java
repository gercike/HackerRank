package DataStructures.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println(reverseArray(new ArrayList<>(Arrays.asList(3, 2, 1))));
    }

    public static List<Integer> reverseArray(List<Integer> a) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = a.size() - 1; i >= 0; i--) {
            result.add(a.get(i));
        }
        return result;
    }
}
