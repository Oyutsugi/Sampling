package Lesson1;

public class number10 {
	public static void main(String[] args) {
		int[] numbers = new int[] { 16, 25, 19, 17, 8, 5 };
		isEvenOdd(numbers);

	}

	public static void isEvenOdd(int[] a) {
		for (int i : a) {
			if (i % 2 == 0) {
				System.out.println(i + "は偶数");
			} else {
				System.out.println(i + "は奇数");
			}
		}
	}
}
