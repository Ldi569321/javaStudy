package creature;

public abstract class Human extends Creature
implements Talkable{

	public Human(int x, int y, int age) {
		super(x, y, age);
 	}

	@Override
	void attack() {
		System.out.println("������ ����");
	}
	
	@Override
	public void talk() {
		System.out.println("���� �����մϴ�.");
	}
	

}
