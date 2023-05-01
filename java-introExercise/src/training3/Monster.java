package training3;

public abstract class Monster implements Creature {

	private String name;  
	private int hitPoint;
	private int power;

	public int getHitPoint() {
		return hitPoint;
	}
	public void setHitPoint(int hitPoint) {
		this.hitPoint = hitPoint;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	protected void appear() {
	}
	
	public void die() {
		System.out.println(name +"は消滅した");
	}
}
