package basic.enumeration;

import java.util.Calendar;

public class EnumWeekExample {
	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		//cal.set(Calendar.DAY_OF_MONTH, 19);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch (week) {
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUESDAY; break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.THURSDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATURDAY; break;
		}
		
		System.out.println(week);
		System.out.println("오늘 요일 : " + today.name());
		System.out.println(today.ordinal());
		System.out.println(today.compareTo(Week.WEDNESDAY));
		
		if (today == Week.SUNDAY) {
			System.out.println("일요일은 슬램덩크를 봐요.");
		} else {
			System.out.println("열심히 자바를 공부합니다.");
		}
		Week[] weeks = Week.values();
		for(Week w: weeks) {
			System.out.println(w);
		}
	}
}
