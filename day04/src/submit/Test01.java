package submit;

public class Test01 {
	
	public static void main(String[] args) {

		Member user2 = new Member();
		Member user1 = new Member("ȫ�浿", "hong");
		Member user3 = new Member("õ����", "user1000", "1234", 30);
		
		System.out.println(user3.toString());
	}
}
