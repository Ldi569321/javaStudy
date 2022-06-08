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
		System.out.println("상공 " + this.y + "미터에서 날고있습니다.");
	}
	
	@Override
	public void flyMode(int x, int y) {
		this.x = this.x +x;
		this.y = this.y +y;
		System.out.println("좌우 " + this.x + ", " + this.y + "미터에서 날고 있습니다.");
	}
}
