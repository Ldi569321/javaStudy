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
		System.out.println(this.type+"타입 몬스터가 출현하였습니다.");
	}
	
	public void attack() {
		
		System.out.println("몬스터가 공격하였습니다.");
	}
	
	public void defense() {
		System.out.println("몬스터가 방어하였습니다.");
	}
	
	public void attackAll(Player[] party) {
		System.out.println("몬스터가 파티 전원을 공격하였습니다.");
		for (int i = 0; i < party.length; i++) {
			party[i].hp -= this.str;
		}
		
	}

	public void attackAll(Player target) {
		target.hp -= str;
		System.out.println(this.hp);
		
	}
}
