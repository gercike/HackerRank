package Algorithms;

public class CircularArrayRotation {
    static int[] circularArrayRotation(int[] array, int rotation, int[] queries) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int shift = rotation % array.length;
            int newIdx = i + shift;
            if (newIdx > array.length - 1) {
                newIdx = i + shift - array.length;
            }
            newArray[newIdx] = array[i];
        }
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            result[i] = newArray[queries[i]];
        }
        return result;
    }
}
