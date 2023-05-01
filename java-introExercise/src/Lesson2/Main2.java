package Lesson2;

public class Main2 {
	public static void main(String[] args) {
		Human male = new Human("能登太郎",22,170,65);
		Human female = new Human("更科雪",23,154,45);
		
		System.out.println(male.getBMI());
		System.out.println(female.getBMI());
		
	    male.showProfile();
	    female.showProfile();
	    
	    System.out.println(male.getStandardWeight());
	    System.out.println(female.getStandardWeight());
	}

}
