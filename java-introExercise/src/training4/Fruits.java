package training4;

import java.util.ArrayList;
import java.util.List;

public class Fruits {
	public static void main(String[] args) {

		List<String> fruits = new ArrayList<String>();
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("pineapple");
		fruits.add("cherry");
		fruits.add("grape");

		System.out.println(fruits.get(0));

		fruits.add("plum");

		screen(fruits);

		fruits.remove(0);
		screen(fruits);

		System.out.println(StringUtils.getFruitPrice("app"));

	}

	private static void screen(List<String> fruit) {
		System.out.println(fruit);
	}
}
