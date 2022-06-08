package creature;

public abstract class Animal extends Creature{

	public Animal(int x, int y, int age) {
		super(x, y, age);
 	}
	
	@Override
	void attack() {
		System.out.println("¸öÅë ¹ÚÄ¡±â");
	}
	
	

}
