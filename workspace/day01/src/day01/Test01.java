package day01;

import java.util.Calendar;

public class Test01 {

	public static void main(String[] args) {

		
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		String ampm;
		ampm = (hour >= 12) ? "����" : "����";
		System.out.println("���� �ð��� " + hour + "���̰�, " + ampm + "�Դϴ�.");
	}

}