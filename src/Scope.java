import java.util.*;


class Difference {
    public int maximumDifference;
    private int[] elements;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] < min) {
                min = elements[i];
            }
            if (elements[i] > max) {
                max = elements[i];
            }
        }
        maximumDifference = max - min;
    }
    // Add your code here

} // End of Difference class

public class Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}