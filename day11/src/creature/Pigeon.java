package creature;

public class Pigeon extends Animal
implements Flyable{

	public Pigeon(int x, int y, int age) {
		super(x, y, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly(int y) {
		this.y = this.y + y;
		System.out.println("��� " + this.y + "���Ϳ��� �����ֽ��ϴ�.");
	}
	
	@Override
	public void flyMode(int x, int y) {
		this.x = this.x +x;
		this.y = this.y +y;
		System.out.println("�¿� " + this.x + ", " + this.y + "���Ϳ��� ���� �ֽ��ϴ�.");
	}
}
