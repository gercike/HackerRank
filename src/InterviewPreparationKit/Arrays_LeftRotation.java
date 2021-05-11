package InterviewPreparationKit;

public class Arrays_LeftRotation {
    static int[] rotLeft(int[] array, int d) {
        int s = d % array.length;
        int[] shifted = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int sPosition = i - s;
            if (sPosition < 0) {
                sPosition = array.length + sPosition;
            }
            shifted[sPosition] = array[i];
        }
        return shifted;
    }
}
