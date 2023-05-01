package Lesson2;

public class Main {
	public static void main(String[] args) {
		  // インスタンス生成
        Calculation c = new Calculation();

        // 以下の設定値を変更し、動作確認しよう
        c.setNumber1(10);
        c.setNumber2(6);

        //  二つの数の和を表示
        System.out.println(c.getNumber1() + " + " + c.getNumber2() + " = " + c.add());

        //  二つの数の差を表示
        System.out.println(c.getNumber1() + " - " + c.getNumber2() + " = " + c.sub());

        //  二つの数の積を表示
        System.out.println(c.getNumber1() + " * " + c.getNumber2() + " = " + c.mul());

        //  二つの平均を表示
        System.out.println(c.getNumber1() + "と" + c.getNumber2() + "の平均は" + c.avg());

    }

	}


