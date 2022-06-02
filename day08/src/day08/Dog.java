package day08;

public class Dog extends Animal{

	Dog(String name) {
		super(name);
	}
	
	@Override
	void say() {
		System.out.println("멍");
	}
	
	void bite() {
		System.out.println("강아지는 문다");
	}
}
