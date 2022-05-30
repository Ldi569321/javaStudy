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
		System.out.println(this.name + "���� ���� �Ǿ����ϴ�. Ÿ���� " + this.type + "Ÿ�� �Դϴ�.");
	}
	
	public void attack(Player target) {
		System.out.println("attack");
		target.hp -= 10;
		System.out.println(this.name + "���� " + target.name + "���� �����Ͽ� hp�� " + target.hp + " ��ҽ��ϴ�.");
	}
	
	public void defense() {
		System.out.println("defense");
		this.mp -= 10;
		System.out.println(this.name + "���� ������ ����� mp�� " + this.mp + " ���ҽ��ϴ�.");
	}
}
