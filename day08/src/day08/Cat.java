package day08;

public class Cat extends Animal{
	
	Cat(String name) {
		super(name);
	}
	
	
	@Override
	void say() {
		System.out.println("��");
	}
	
	void nightSee() {
		System.out.println("����̴� �㿡 ���� ����");
	}
	

}
