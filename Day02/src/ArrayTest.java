

public class ArrayTest {
	public static void main(String[] args) {
		int s1 = 100;
		int s2 = 90;
		int s3 = 85;
		int s4 = 70;
		
		int score[] = {100, 90, 85, 70};
		
		for(int i = 0; i<score.length; i++) {
			System.out.println(score[i]);
		}
		
		int[] score2;
		score2 = new int[] {100, 90, 85, 70};
		

		int[] idontknow = new int[10];
		
		for(int i = 0; i<idontknow.length; i++) {
			System.out.println(idontknow[i]);
		}
		
		System.out.println("----------------------");
		
		int[][] scores = new int[2][3];
		System.out.println(scores.length);
		System.out.println(scores[1].length);
		
		System.out.println("------------------");
		
		int[][] testScores = new int[2][];
		testScores[0] = new int[1];
		testScores[1] = new int[2];
		System.out.println(testScores[0].length);
		System.out.println(testScores[1].length);
		
		
		int[2][] score2x2Arr = {{100, 90, 85, 70},{30, 70, 60}};
	}
}
