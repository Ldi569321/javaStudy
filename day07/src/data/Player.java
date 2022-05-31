package data;

public class Player {
	public int hp;
	public int mp;
	
	final String name = "";
	
	public Player(int hp, int mp) {
		System.out.println("Player is called");
		this.hp = hp;
		this.mp = mp;
	}
	
	public void attack() {
		System.out.println("punch");
	}
}
