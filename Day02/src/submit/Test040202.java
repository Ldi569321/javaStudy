package submit;

public class Test040202 {

	public static void main(String[] args) {
		int score = 0;
		for(int i=1; i<=100; i++) {
			if (i%3==0) {
				score = score + i;
			}
		}
		System.out.println(score);
	}

}
