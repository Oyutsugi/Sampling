package training3;


public class Battle {

	
	public static void main(String[] args) {

	
		 System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		 Fighter fighter = new Fighter();

		
		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		Slime slime1 = new Slime(4);
		Slime slime2 = new Slime(5);
        slime1.appear();
		fighter.attack(slime1);
		
		slime2.appear();
		fighter.attack(slime2);
		
		Slime slime3 = new Slime(6);
		slime3.appear();
		fighter.attack(slime3);
		
		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		Boss boss = new Boss();
  

		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		 Wizard wizard = new Wizard();
		 wizard.heal(fighter);
      
        fighter.attack(boss);
		if ((boss.getHitPoint() > 0)== false) {
			System.out.println("英雄たちは平和を守り切った");
			return;
		}

		System.out.println("英雄たちは平和を守り切れなかった");
	}
	
}
