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
		System.out.println("이름: " + this.getName() + 
				"\n나이: " + this.getAge());
		System.out.println("학번: " + Number+"\n");
	}
	
	
}
