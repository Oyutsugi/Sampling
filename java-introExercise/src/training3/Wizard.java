package training3;

public class Wizard extends Hero {

	public Wizard() {
		super("�E�B�U�[�h", 1, 10, 1, 1);
		// TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
	}

	@Override
	public void summoned() {
		System.out.println("�E�B�U�[�h�����a�̂��߂ɏ������ꂽ�I");
		System.out.println("�E�B�U�[�h�͉񕜎������g����");
	}

	public void heal(Hero hero) {
		System.out.println("�E�B�U�[�h�̓t�@�C�^�[��HP���񕜂����I(HP:" + (hero.getHitPoint()+ 10));
        hero.setHitPoint(hero.getHitPoint() + 10);
	}
}
