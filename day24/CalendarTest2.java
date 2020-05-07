package com.day24;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest2 {
	public static void main(String[] args) {
		String[] week = {"","일","월","화","수","목","금","토"};
		
		Calendar date1 = Calendar.getInstance(); // public static Calendar getInstance()
		date1.set(2020, 5, 1); // 2020-06-01 월
		
		int day = date1.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("요일 : " + day);
		System.out.println("요일 : " + week[day]);
		
		//며칠 후, 몇 개월 전, 몇 년 후 계산
		Calendar date2 = new GregorianCalendar(2020,5,1); // 2020.06.01
		System.out.println("\n" + showDate(date2));
		
		//100일후
		date2.add(Calendar.DATE, 100);
		System.out.println("100일 후 : " + showDate(date2));
		
		//2020.09.09 기준 5개월 전
		date2.add(Calendar.MONTH, -5);
		System.out.println("5개월 전 : " + showDate(date2));
		
		//2020.04.09 기준 2년 후
		date2.add(Calendar.YEAR, 2);
		System.out.println("2년 후 : " + showDate(date2));
		System.out.println();
	}
	
	public static String showDate(Calendar c) {
		return (c.get(Calendar.YEAR) + "년 " + (c.get(Calendar.MONTH)+1) + "월 " + c.get(Calendar.DATE) 
				+ "일");
	}
}
