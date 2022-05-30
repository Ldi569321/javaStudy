package submit;

public class Member {
	public String name;
	public String id;
	public String password;
	public int age;
	
	public Member(String name, String id, String password, int age) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}
	
	public Member(String name, String id) {
		this(name, id, "", 0);
	}
	public Member(String name, String id, int age) {
		this(name, id, "", 0);
	}
	public Member() {
		
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", id=" + id + ", password=" + password + ", age=" + age + "]";
	}

	
}
