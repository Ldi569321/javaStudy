package creature;

public class Turtle extends Animal
implements Swimable{

	public Turtle(int x, int y, int age) {
		super(x, y, age);
	}

	@Override
	public void swimDown(int y) {
		this.y = this.y - y;
		System.out.println("���� " + this.y + "���Ϳ��� �������Դϴ�.");
	}
}
