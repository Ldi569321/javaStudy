package submit;

public class Student {
	
	//�ʵ�
	public String name;
	public int age;
	
	//������
	public Student(int age) {
		this.age = age;
	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//�޼���
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}
