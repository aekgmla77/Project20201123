package com.ydm;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		showCal(2020, 10);
	}

	public static void showCal(int year, int month) {
		System.out.println("\t[" + year + "년 " + month + "월]");
		Calendar cal = Calendar.getInstance();
//		cal.set(2020, 1, 1); // 2020/2/1
//		System.out.println("년도: " + cal.get(Calendar.YEAR));
//		System.out.println("월: " + cal.get(Calendar.MONTH));
//		System.out.println("날짜: " + cal.get(Calendar.DATE));
//		System.out.println("요일: " + cal.get(Calendar.DAY_OF_WEEK)); // 요일
//		System.out.println("요일: " + cal.getActualMaximum(Calendar.DATE)); // 마지막 날짜

		String[] days = { "sun", "mon", "tue", "wed", "thr", "fri", "sat" };
		for (int i = 0; i < days.length; i++) {
			System.out.printf("%4s", days[i]); // d는 요일
		}
		System.out.println();
		cal.set(year, month + 1, 1);
		int lDay = cal.getActualMaximum(Calendar.DATE); // 마지막 날
		int lDate = cal.get(Calendar.DAY_OF_WEEK); // 첫번째 날의 요일.

		for (month = 1; month <= 12; month++) {
		}

		for (int i = 1; i < lDay; i++) {
			System.out.printf("%4d", i);
			if (i % 7 == 0)
				System.out.println();
		}
		for (int i = 1; i < lDate; i++) {
			System.out.println("\t" + i); // \t는 수평탭

		}

	}

}
