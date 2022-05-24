package submit;

public class Test02 {

	public static void main(String[] args) {
		String[][] box = new String[5][];
		
		box[0] = new String[1];
		box[1] = new String[2];
		box[2] = new String[3];
		box[3] = new String[4];
		box[4] = new String[5];
		
		for(int i=0; i<box.length; i++) {
			for (int j = 0; j < box[i].length; j++) {
				box[i][j] = "*";
				System.out.print(box[i][j]);
				
			}System.out.println("");
	}

}
}
