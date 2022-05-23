package day01;

import java.util.Calendar;

public class Test01 {

	public static void main(String[] args) {

		
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		String ampm;
		ampm = (hour >= 12) ? "오후" : "오전";
		System.out.println("지금 시간은 " + hour + "시이고, " + ampm + "입니다.");
	}

}