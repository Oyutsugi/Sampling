package training3;


public class Boss extends Monster {

	
	public Boss() {
		setName("ラスボス");
		setHitPoint(20);
		setPower(3);
		
	}
	
	@Override
	public void die() {
		System.out.println(getName()+"は断末魔をあげて消滅した");
	}
}
