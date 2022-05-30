package submit;

import java.util.Random;

public class Player {
	public String name;
	public int hp;
	public int str;
	public int mp;
	public String type;
	final String[] TYPE = {"WATER", "EARTH", "FIRE", "AIR"};
	
	public Player(String name) {
		this.name = name;
		this.hp = 100;
		this.mp = 100;
		this.str = 10;
		Random random = new Random();
		int summon = random.nextInt(4);
		this.type = this.TYPE[summon];
		System.out.println(this.name + "님이 생성 되었습니다. 타입은 " + this.type + "타입 입니다.");
	}
	
	public void attack(Player target) {
		System.out.println("attack");
		target.hp -= 10;
		System.out.println(this.name + "님이 " + target.name + "님을 공격하여 hp를 " + target.hp + " 깎았습니다.");
	}
	
	public void defense() {
		System.out.println("defense");
		this.mp -= 10;
		System.out.println(this.name + "님이 공격을 방어해 mp가 " + this.mp + " 남았습니다.");
	}
}
