package submit;

import java.util.Random;

public class Monster {
	public int str;
	public int hp;
	public int mp;
	public String type;
	final String[] TYPE = {"WATER", "EARTH", "FIRE", "AIR"};
	
	
	public Monster () {
		str = 10;
		Random random = new Random();
		int summon = random.nextInt(4);
		this.type = this.TYPE[summon];
		System.out.println(this.type+"Ÿ�� ���Ͱ� �����Ͽ����ϴ�.");
	}
	
	public void attack() {
		
		System.out.println("���Ͱ� �����Ͽ����ϴ�.");
	}
	
	public void defense() {
		System.out.println("���Ͱ� ����Ͽ����ϴ�.");
	}
	
	public void attackAll(Player[] party) {
		System.out.println("���Ͱ� ��Ƽ ������ �����Ͽ����ϴ�.");
		for (int i = 0; i < party.length; i++) {
			party[i].hp -= this.str;
		}
		
	}

	public void attackAll(Player target) {
		target.hp -= str;
		System.out.println(this.hp);
		
	}
}
