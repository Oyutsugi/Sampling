package training3;

public class Wizard extends Hero {

	public Wizard() {
		super("ウィザード", 1, 10, 1, 1);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void summoned() {
		System.out.println("ウィザードが平和のために召喚された！");
		System.out.println("ウィザードは回復呪文が使える");
	}

	public void heal(Hero hero) {
		System.out.println("ウィザードはファイターのHPを回復した！(HP:" + (hero.getHitPoint()+ 10));
        hero.setHitPoint(hero.getHitPoint() + 10);
	}
}
