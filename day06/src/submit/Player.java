package submit;

import java.util.Iterator;
import java.util.Random;

public class Player {
	public String name;
	public int hp;
	public int mp;
	public int str;
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
	
	public void attack(Player player) {
		System.out.println("attack");
		player.hp -= 10;
		System.out.println(this.name + "���� " + player.name + "���� �����Ͽ� hp�� " + player.hp + " ��ҽ��ϴ�.");
	}
	
	public void defense() {
		System.out.println("defense");
		this.mp -= 10;
		System.out.println(this.name + "���� ������ ����� mp�� " + this.mp + " ���ҽ��ϴ�.");
	}
}
