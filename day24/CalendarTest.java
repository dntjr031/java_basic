package com.day24;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DATE);
		
		System.out.println(year +"�� " + (month + 1) + "�� " + date + "��");
		
		int h = cal.get(Calendar.HOUR_OF_DAY);
		int hh = cal.get(Calendar.HOUR);
		int m = cal.get(Calendar.MINUTE);
		int s = cal.get(Calendar.SECOND);
		int day = cal.get(Calendar.DAY_OF_WEEK); // ����, 1:�� ...
		int ampm = cal.get(Calendar.AM_PM); // 0:����, 1:����
		
		String sAmPm = ampm == 0?"����":"����";
		
		System.out.println(h + "�� " + m + "�� " + s + "��");
		System.out.println(hh + "�� " + m + "�� " + s + "�� " + sAmPm);
		
		System.out.println("���� : " + day);
		
		//1970-01-01 00:00:00 ���� ����� �ð��� �и��ʷ� ����
		long gap = cal.getTimeInMillis();
		gap = gap/(24*60*60);
		System.out.println("1970-01-01 00:00:00 ���� ����� �ð� : " + gap);
		
	}

}
