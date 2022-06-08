package creature;

public abstract class Human extends Creature
implements Talkable{

	public Human(int x, int y, int age) {
		super(x, y, age);
 	}

	@Override
	void attack() {
		System.out.println("도구로 공격");
	}
	
	@Override
	public void talk() {
		System.out.println("말이 가능합니다.");
	}
	

}
