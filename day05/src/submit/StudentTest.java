package submit;

public class StudentTest {

	public static void main(String[] args) {

		Student[] st = new Student[4];

		for (int i = 0; i < st.length; i++) {
			st[i] = new Student("student"+(i+1), i+17);
			System.out.println(st[i]);
		}

		System.out.println("----------------------------------");
		System.out.println("1���� ���� 2023���� �Ǿ����ϴ�.");
		for (int j = 0; j < st.length; j++) {
			st[j].age++;
			System.out.println(st[j]);
		}
	}
}