package Algorithms;

public class AppleAndOrange {
	public static void main(String[] args) {

	}

	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		int applesIn = 0;
		int orangesIn = 0;
		for (int apple : apples) {
			if (a + apple >= s && a + apple <= t) {
				applesIn++;
			}
		}
		for (int orange : oranges) {
			if (b + orange >= s && b + orange <= t) {
				orangesIn++;
			}
		}
		System.out.println(applesIn);
		System.out.println(orangesIn);
	}
}
