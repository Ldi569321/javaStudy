package day01;

public class Test05 {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		
		int j1 = 10;
		int j2 = 10;
		
		if(j1==j2) {
			System.out.println("j1�� j2�� ���� ���� ����Ű�� �ֽ��ϴ�.");
		}
		
		if(s1==s2) {
			System.out.println("s1�� s2�� ���� �ּ����� ����Ű�� �ֽ��ϴ�.");
		}else {
			System.out.println("s1�� s2�� �ٸ� �ּ����� ����Ű�� �ֽ��ϴ�.");
		}

		String s3 = new String("Hello");

		String s4 = new String("Hello");
		
		
		if(s3 == s4) {
			System.out.println("s3�� s4�� ���� �ּ����� ����Ű�� �ֽ��ϴ�.");
		}else {
			System.out.println("s3�� s4�� �ٸ� �ּ����� ����Ű�� �ֽ��ϴ�.");
		}
		
		if(s3.equals(s4)) {
			System.out.println("s3�� s4�� ���ڿ� ���� �����ϴ�.");
		}
	}

}
