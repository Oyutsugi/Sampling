package training3;


public class Boss extends Monster {

	
	public Boss() {
		setName("���X�{�X");
		setHitPoint(20);
		setPower(3);
		
	}
	
	@Override
	public void die() {
		System.out.println(getName()+"�͒f�����������ď��ł���");
	}
}
