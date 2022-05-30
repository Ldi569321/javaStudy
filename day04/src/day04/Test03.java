package day04;

public class Test03 {

	public static void main(String[] args) {
		
		int[] arr = new int[4];
		
		Student[] s = new Student[4];
		for(int i=0; i<s.length; i++) {			
			s[i] = new Student();
			s[i].name = "a";
			System.out.println(s[i].name);
			}
		for(int i=0; i<s.length; i++) {
			s[i] = new Student();
			s[i].age++;
			System.out.println(s[i].age);
		}
	}

}
