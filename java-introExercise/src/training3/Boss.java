package training3;


public class Boss extends Monster {

	
	public Boss() {
		setName("ƒ‰ƒXƒ{ƒX");
		setHitPoint(20);
		setPower(3);
		
	}
	
	@Override
	public void die() {
		System.out.println(getName()+"‚Í’f–––‚‚ğ‚ ‚°‚ÄÁ–Å‚µ‚½");
	}
}
