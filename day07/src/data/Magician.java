package data;
public class Magician extends Player {
	public void fireball() {
		System.out.println("fireball");
	}
	
	@Override
	public void attack() {
		super.attack();
		System.out.println("wand punch");
	}

	public Magician() {
		super(100, 2000);
		System.out.println("Magician is called");
		System.out.println(this.hp);
	}
}
