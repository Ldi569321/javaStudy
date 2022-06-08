package creature;

public class Test {

	public static void main(String[] args) {
		
		Kevin kevin1 = new Kevin(20, 0, 10);
		kevin1.attack();
		kevin1.coding();
		kevin1.swimDown(21);
		kevin1.printinfo();
		System.out.println("---------------------------");
		
		Turtle t1 = new Turtle(1, 10, 5);
		t1.attack();
		t1.swimDown(30);
		t1.printinfo();
		System.out.println("---------------------------");
		
		Pigeon p1 = new Pigeon(30, 20, 6);
		p1.attack();
		p1.fly(10);
		p1.flyMode(20, 10);
		p1.printinfo();
	}

}
