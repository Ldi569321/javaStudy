package submit;

public class Test01 {

	public static void main(String[] args) {
		int[][] arr = new int[4][4];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length+1; j++) {
				arr[i][j-1] = (4*i)+j;
				System.out.print(arr[i][j-1]+"    ");
			}
			System.out.println(" ");
		}
		System.out.println("------------------");
		int[][] rotatedArr = new int[4][4];
		for (int A = 0; A <= 3; A++) {
			for (int B = 3; B > -1; B--) {
				rotatedArr[A][B] = (4*B)+A+1;
				System.out.print(rotatedArr[A][B]+"    ");	
			}
			System.out.println(" ");
		}
		System.out.println("---------------------");
		int[][] rotatedArr1 = new int[4][4];
		for (int A = 0; A < rotatedArr1.length; A++) {
			for (int B = 0; B < rotatedArr1[A].length; B++) {
				rotatedArr1[A][B] = arr[arr.length-1-A][B];
				System.out.print(rotatedArr1[A][B]+"    ");
			}
			System.out.println(" ");
		}
	}

}
