package submit;

public class StudentTest {

	public static void main(String[] args) {

		Student[] st = new Student[4];

		for (int i = 0; i < st.length; i++) {
			st[i] = new Student("student"+(i+1), i+17);
			System.out.println(st[i]);
		}

		System.out.println("----------------------------------");
		System.out.println("1년이 지나 2023년이 되었습니다.");
		for (int j = 0; j < st.length; j++) {
			st[j].age++;
			System.out.println(st[j]);
		}
	}
}