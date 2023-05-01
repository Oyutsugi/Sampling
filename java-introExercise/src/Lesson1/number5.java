package Lesson1;

public class number5 {
	public static void main(String[] args){
		int[] grades = new int[]{49,43,53,54,73,72,35,93,67,74};
		

		gradesJudge(grades);

    }

	public static void gradesJudge(int[] number) {
		
		for(int a :number) {
		if(a >= 80 && a < 100) {
			System.out.println( "優");
			
			
		}else if(a >= 70 && a < 80) {
			System.out.println( "良");
		}else if(a >= 60 && a < 70) {
			System.out.println( "可");
		}else if( a < 60 && a > 0) {
			System.out.println( "不可");
		}else { 
			throw new IllegalArgumentException("成績は0から100の範囲内で入力してください。指定値:" + a);
		}
		//else 
		//	return null;
		//}人間には「aにはこれ以外の数字は入らない」と分かるが機械側はそれを理解しないため、最後にreturnでnullを返す必要がある
	    }
	}
}
	

