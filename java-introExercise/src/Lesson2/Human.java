package Lesson2;

public class Human {
	/** 名前 */
	private String name;

	/** 年齢 */
	private int age;

	/** 身長(cm) */
	private int height;

	/** 体重(kg) */
	private int weight;

	Human(String name, int age, int height, int weight) {
		if (name == null || age <= 0 || height <= 0 || weight <= 0) {
			throw new IllegalArgumentException("いずれかの値に不正があります");
		}
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;

	}

	public void setStatus(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public void showProfile() {
		System.out.println("名前:" + this.name);
		System.out.println("年齢" + this.age);
		System.out.println("身長" + this.height);
		System.out.println("体重" + this.weight);
	}

	public double getStandardWeight() {
		return 22 * (height / 100) * (height / 100);
	}

	public double getBMI() {
		return weight / (height / 100) * (height / 100);
	}
}
