package Lesson1;

public class number3 {
	public static void main(String[] args) {
		int number = 33;
		nabeJudge(number);
	}
	
	public static void nabeJudge(int a) {
		if(a % 3 == 0) {
		   System.out.println(a + "は３の倍数です");
		}else if(a == 0) {
			System.out.println("0です");
		}else {
			System.out.println("ネタにならない");
		}
	}

}
