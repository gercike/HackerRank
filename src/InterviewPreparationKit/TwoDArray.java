package InterviewPreparationKit;

public class TwoDArray {

    static int hourglassSum(int[][] arr) {
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr[i].length - 2; j++) {
                int subSum = 0;
                subSum += arr[i][j];
                subSum += arr[i][j + 1];
                subSum += arr[i][j + 2];
                subSum += arr[i + 1][j + 1];
                subSum += arr[i + 2][j];
                subSum += arr[i + 2][j + 1];
                subSum += arr[i + 2][j + 2];
                if (subSum > sum) {
                    sum = subSum;
                }
            }
        }
        return sum;
    }
}
