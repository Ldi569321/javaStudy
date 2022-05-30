	package day04;

import java.util.Calendar;

import data.Week;

public class Test01 {
	public static void main(String[] args) {
		
				Calendar  cal = Calendar.getInstance();
				
				int week = cal.get(Calendar.DAY_OF_WEEK);
				
				Week toDay = null;
				
				switch (week) {
				
				case 1:
					toDay = Week.SUNDAY;
					break;
					
				case 2:
					toDay  = Week.MONDAY;
					break;
					
				case 3:
					toDay = Week.TUESDAY;
					break;
					
				case 4:
					toDay = Week.WEDNESDAY;
					break;
					
				case 5:
					toDay = Week.THURSDAY;
					break;
					
				case 6:
					toDay = Week.FRIDAY;
					break;
					
				case 7:
					toDay = Week.SATURDAY;
					break;
					
				}
				System.out.println("오늘은 " + toDay + "입니다, ");
			}
		
}
