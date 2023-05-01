package Lesson1;

public class number1 {
	public static void main(String[] args) {
		String a = "8";
		String b = "9";
		
		System.out.println(changeInt(a,b));
	}
	
	public static int changeInt(String a,String b) {
		int c =Integer.parseInt(a);
		int d =Integer.parseInt(b);
		
		return c + d;
	}

}
