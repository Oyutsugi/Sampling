package training3;

public class Fighter extends Hero {
	public Fighter() {
		super("ファイター", 1, 10, 1, 1);
	}
	
	public void summoned() {
		System.out.println("ファイターは平和のために召喚された(HP:10");
		System.out.println("ファイターは息込んでいる");
	}
}
