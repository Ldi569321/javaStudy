package day08;

public class Cat extends Animal{
	
	Cat(String name) {
		super(name);
	}
	
	
	@Override
	void say() {
		System.out.println("냥");
	}
	
	void nightSee() {
		System.out.println("고양이는 밤에 눈이 좋다");
	}
	

}
