package day08;

public class Animal {
	
	String name;
	
	void say() {
		System.out.println("������ ����");
	}
	
	Animal(String name) {
		this.name = name;
	}
	
	void attack(Animal a) {
		System.out.println(this.name + "�� " + a.name + "�� ����");
	}
}
