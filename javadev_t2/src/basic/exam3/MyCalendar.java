package basic.exam3;

import java.util.Calendar;
import java.util.Scanner;

public class MyCalendar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 : ");int year = sc.nextInt();
		System.out.print("월   : ");int month = sc.nextInt();
		
		Calendar c = Calendar.getInstance();
		c.set(year, month - 1, 1);
		int week = c.get(Calendar.DAY_OF_WEEK);
		int end_day = c.getActualMaximum(Calendar.DATE);
		System.out.println(year + "년 " + month + "월 ");
		System.out.println("--------------------");
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("--------------------");
		
		for(int d=1; d < week; d++) {
			System.out.print("   ");
		}
		for(int d=1, w=week; d <= end_day; d++, w++) {
			System.out.print(d < 10 ? " " + d +" " : d + " ");
			if (w % 7 == 0) System.out.println();
		}
	}
}
