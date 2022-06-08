package creature;

public abstract class Creature {
	int x;
	int y;
	int age;
	
	public Creature(int x, int y, int age) {
		this.x = x;
		this.y = y;
		this.age = age;
	}
	
	abstract void attack();
	
	void printinfo() {
		System.out.println("ÁÂÇ¥: (" + this.x + "," + this.y + ")");
		System.out.println("³ªÀÌ: " + this.age);
	}
}
