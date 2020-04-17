package com.day24;

import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Calendar my = Calendar.getInstance();
		my.set(1994, 2, 3);
		
		long gap = cal.getTimeInMillis() - my.getTimeInMillis();
		gap = gap/(24*60*60)/1000;
		System.out.println("생일(1994-03-03)이후 경과 일수: " + gap);
		
		my.set(2020, 11, 25);
		gap = my.getTimeInMillis() - cal.getTimeInMillis();
		gap = gap/(24*60*60)/1000;
		System.out.println("크리스마스까지 남은 일수: " + gap);
		
		cal.add(Calendar.DATE, -50);
		
		System.out.println("50일 전: " + cal.get(Calendar.YEAR) + "년 " + (cal.get(Calendar.MONTH)+1) 
						+ "월 " + cal.get(Calendar.DATE) + "일");
	}

}
