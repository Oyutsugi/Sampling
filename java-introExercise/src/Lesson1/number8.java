package Lesson1;

public class number8 {
	public static void main(String[] args) {
		int number = 3;
		squarePic2(number);

	}

	public static void squarePic(int a) {
		if (a <= 0) {
			System.out.println("なにも表示出来ません");
		}
		for (int i = 0; i < a; i++) {
			System.out.println("◆".repeat(a));

		}
	}

	public static void squarePic2(int a) {
		if (a <= 0) {
			System.out.println("うん");
		}

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print("◆");
			}
			System.out.println();
		}

	}
}