package Algorithms;

import java.util.Arrays;
import java.util.List;

public class GridChallenge {
    public static String gridChallenge(List<String> grid) {
        char[][] array = new char[grid.size()][grid.get(0).length()];
        for (int i = 0; i < grid.size(); i++) {
            char[] arr = grid.get(i).toCharArray();
            Arrays.sort(arr);
            array[i] = arr;
        }
        int value = 0;
        if (grid.size() > 1) {
            for (int i = 0, j = 0; j < array[0].length; ) {
                if (i == 0) {
                    value = array[i][j];
                    i++;
                    continue;
                }
                if (i > 0) {
                    if (array[i][j] < value) {
                        return "NO";
                    }
                    value = array[i][j];
                    i++;
                }
                if (i == array.length) {
                    j++;
                    i = 0;
                }
            }
        }
        return "YES";
    }
}
