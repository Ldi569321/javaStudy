package day01;

public class Test05 {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		
		int j1 = 10;
		int j2 = 10;
		
		if(j1==j2) {
			System.out.println("j1과 j2는 같은 값을 가리키고 있습니다.");
		}
		
		if(s1==s2) {
			System.out.println("s1과 s2는 같은 주소지를 가리키고 있습니다.");
		}else {
			System.out.println("s1과 s2는 다른 주소지를 가리키고 있습니다.");
		}

		String s3 = new String("Hello");

		String s4 = new String("Hello");
		
		
		if(s3 == s4) {
			System.out.println("s3과 s4는 같은 주소지를 가리키고 있습니다.");
		}else {
			System.out.println("s3과 s4는 다른 주소지를 가리키고 있습니다.");
		}
		
		if(s3.equals(s4)) {
			System.out.println("s3와 s4의 문자열 값은 같습니다.");
		}
	}

}
