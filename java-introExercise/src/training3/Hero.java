package training3;

public abstract class Hero implements Creature {
	private String name;
	private int level;
	private int hitPoint;
	private int power;
	private int growth;

	public Hero(String name, int level, int hitPoint, int power, int growth) {
		if (name == null) {
			throw new IllegalArgumentException("���O�~�X");
		}
		if (level <= 0) {
			throw new IllegalArgumentException("���x���~�X");
		}
		if (hitPoint <= 0) {
			throw new IllegalArgumentException("HP�~�X");

		}
		if (power < 0) {
			throw new IllegalArgumentException("�p���[�~�X");

		}
		if (growth < 0) {
			throw new IllegalArgumentException("�������~�X");
		}
		this.name = name;
		this.level = level;
		this.hitPoint = hitPoint;
		this.power = power;
		this.growth = growth;
	}

	 public void attack(Monster boss) {
	
		while (this.hitPoint > 0 && boss.getHitPoint() > 0) {
	
	 		// �p�Y���烂���X�^�[�ւ̍U��
	 		boss.setHitPoint(java.lang.Math.max(boss.getHitPoint() - this.power, 0));
	 		System.out.println(this.name + "�̍U���I" + boss.getName() + "�Ƀ_���[�W�I�iHP�F" + boss.getHitPoint() + "�j");
	
	 		// �����X�^�[��HP��0�ȉ��̏ꍇ
		if (boss.getHitPoint() <= 0) {
				boss.die();
	 			this.level++;
				System.out.println(this.name + "�̓��x���A�b�v�����I�I�i���x���F" + this.level + "�j");
				this.power += this.growth;
				System.out.println(this.name + "�͍U���͂��オ�����I�I�i�U���́F" + this.power + "�j");
				return;
			}

			// �����X�^�[����p�Y�ւ̍U��
			this.hitPoint = java.lang.Math.max(this.hitPoint - boss.getPower(), 0);
			System.out.println(boss.getName() + "�̍U���I" + this.name + "�Ƀ_���[�W�I�iHP�F" + this.hitPoint + "�j");

			// �p�Y��HP��0�ȉ��̏ꍇ
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
		System.out.println(name +"�͗͐s����");
	}
}   
