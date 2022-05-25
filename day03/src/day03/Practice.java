package day03;


public class Practice {

	public static void main(String[] args) {
		
		int[] arr = new int[4];
		
		for (int i = 0; i < arr.length; i++){
				arr[i] = i*10+3;
			}
		
		for(int row:arr) {
			System.out.print(row+"          ");
			
		}System.out.println("-----------------");
		
		String[] arr1 = new String[4];
		
		for (int i = 0; i < arr.length; i++){
				arr1[i] = "*";
			}
		
		for(String row:arr1) {
			System.out.print(row+"          ");
	}
}
	}
