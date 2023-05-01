package training3;

public class Slime extends Monster {
    private int encount;
    
	public int getEncount() {
		return encount;
	}

	public Slime(int encount) {
		setName("スライム");
		setHitPoint(3);
		setPower(1);
		this.encount =encount;
		
	}
	
	@Override
	
	public void appear() {
		System.out.println(getName()+(getEncount()+"体目") + "が現れた HP:" +getHitPoint());
	}

}
