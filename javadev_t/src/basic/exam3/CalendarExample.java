package basic.exam3;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DATE);
		int week = now.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("년도 : " + year);
		System.out.println("월 : " + month);
		System.out.println("일 : " + day);
		System.out.println("몇번째 요일 : " + week);
		
/*		now.set(2017, 5, 18);
		
		year = now.get(Calendar.YEAR);       
		month = now.get(Calendar.MONTH) + 1; 
		day = now.get(Calendar.DATE);        
		week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println("년도 : " + year);
		System.out.println("월 : " + month);
		System.out.println("일 : " + day);
		System.out.println("몇번째 요일 : " + week);*/
		
		now.set(Calendar.DATE, 1);
		year = now.get(Calendar.YEAR);       
		month = now.get(Calendar.MONTH) + 1; 
		day = now.get(Calendar.DATE);        
		week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println("년도 : " + year);
		System.out.println("월 : " + month);
		System.out.println("일 : " + day);
		System.out.println("몇번째 요일 : " + week);
		System.out.println("마지막 날 : " + now.getActualMaximum(Calendar.DATE));
	}
}
