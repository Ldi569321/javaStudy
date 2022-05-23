package day01;

import java.util.Calendar;

public class Test02 {

	public static void main(String[] args) {
		
		int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
		String season = "";
		
		switch (month) {
			case 12, 1, 2:
				season = "겨울";
				break;
				
			case 3, 4, 5:
				season = "봄";
				break;
				
			case 6, 7, 8:
				season = "여름";
				break;
				
			case 9, 10, 11:
				season = "가을";
				break;
				
		}
		System.out.println("지금은 " + month + "월이고, " + season + "입니다.");
	}

}
