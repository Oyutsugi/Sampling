package Lesson1;

public class number2 {
	public static void main(String[] args) {
		int number = 5;
	    System.out.println(valueJudge(number));
	}
	public static String valueJudge(int a) {
		if(a > 0) {
			return "正";
		}else if(a == 0) {
			return "0";
		}else {
			return "負";
		}
	}

}
