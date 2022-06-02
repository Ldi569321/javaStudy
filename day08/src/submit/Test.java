package submit;

public class Test {
	
	public static void main(String[] args) {
		Student st1 = new Student("st1", 17);
		Student st2 = new Student();
		st2.setName("st1");
		st2.setAge(312);
		
		st1.printInfo();
		st2.printInfo();
	}
}
