package training3;

public abstract class Hero implements Creature {
	private String name;
	private int level;
	private int hitPoint;
	private int power;
	private int growth;

	public Hero(String name, int level, int hitPoint, int power, int growth) {
		if (name == null) {
			throw new IllegalArgumentException("名前ミス");
		}
		if (level <= 0) {
			throw new IllegalArgumentException("レベルミス");
		}
		if (hitPoint <= 0) {
			throw new IllegalArgumentException("HPミス");

		}
		if (power < 0) {
			throw new IllegalArgumentException("パワーミス");

		}
		if (growth < 0) {
			throw new IllegalArgumentException("成長率ミス");
		}
		this.name = name;
		this.level = level;
		this.hitPoint = hitPoint;
		this.power = power;
		this.growth = growth;
	}

	 public void attack(Monster boss) {
	
		while (this.hitPoint > 0 && boss.getHitPoint() > 0) {
	
	 		// 英雄からモンスターへの攻撃
	 		boss.setHitPoint(java.lang.Math.max(boss.getHitPoint() - this.power, 0));
	 		System.out.println(this.name + "の攻撃！" + boss.getName() + "にダメージ！（HP：" + boss.getHitPoint() + "）");
	
	 		// モンスターのHPが0以下の場合
		if (boss.getHitPoint() <= 0) {
				boss.die();
	 			this.level++;
				System.out.println(this.name + "はレベルアップした！！（レベル：" + this.level + "）");
				this.power += this.growth;
				System.out.println(this.name + "は攻撃力が上がった！！（攻撃力：" + this.power + "）");
				return;
			}

			// モンスターから英雄への攻撃
			this.hitPoint = java.lang.Math.max(this.hitPoint - boss.getPower(), 0);
			System.out.println(boss.getName() + "の攻撃！" + this.name + "にダメージ！（HP：" + this.hitPoint + "）");

			// 英雄のHPが0以下の場合
			if (this.hitPoint <= 0) {
				die();
			}
	 	}
	 }
	 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

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

	public int getGrowth() {
		return growth;
	}

	public void setGrowth(int growth) {
		this.growth = growth;
	}

	public abstract void summoned();
	
	public void die() {
		System.out.println(name +"は力尽きた");
	}
}   
