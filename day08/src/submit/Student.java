package submit;

public class Student extends Person {

	private final int Number = 20309;

	public Student(String name, int age) {
		super(name, age);
	}
	public Student() {
		this("", 0);
	}
	@Override
	public void printInfo() {
		System.out.println("�̸�: " + this.getName() + 
				"\n����: " + this.getAge());
		System.out.println("�й�: " + Number+"\n");
	}
	
	
}
