package Lesson1;

public class number9 {
	public static void main(String[] args) {
		int[] numbers = new int[] { 2, 5, 2, 1 };
		String picture = "◆";
		
		changeToPic(numbers, picture);
	}

	public static void changeToPic(int[] a, String b) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i]; j++) {
				System.out.print(b);
			}
			System.out.println();
		}
	}

}
