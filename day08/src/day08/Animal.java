package day08;

public class Animal {
	
	String name;
	
	void say() {
		System.out.println("뭔가를 말함");
	}
	
	Animal(String name) {
		this.name = name;
	}
	
	void attack(Animal a) {
		System.out.println(this.name + "가 " + a.name + "를 공격");
	}
}
