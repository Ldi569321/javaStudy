package day01;

import java.util.Calendar;

public class Test02 {

	public static void main(String[] args) {
		
		int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
		String season = "";
		
		switch (month) {
			case 12, 1, 2:
				season = "�ܿ�";
				break;
				
			case 3, 4, 5:
				season = "��";
				break;
				
			case 6, 7, 8:
				season = "����";
				break;
				
			case 9, 10, 11:
				season = "����";
				break;
				
		}
		System.out.println("������ " + month + "���̰�, " + season + "�Դϴ�.");
	}

}
