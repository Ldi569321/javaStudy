package day08;

public class Dog extends Animal{

	Dog(String name) {
		super(name);
	}
	
	@Override
	void say() {
		System.out.println("��");
	}
	
	void bite() {
		System.out.println("�������� ����");
	}
}
