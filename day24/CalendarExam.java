package com.day24;

import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Calendar my = Calendar.getInstance();
		my.set(1994, 2, 3);
		
		long gap = cal.getTimeInMillis() - my.getTimeInMillis();
		gap = gap/(24*60*60)/1000;
		System.out.println("����(1994-03-03)���� ��� �ϼ�: " + gap);
		
		my.set(2020, 11, 25);
		gap = my.getTimeInMillis() - cal.getTimeInMillis();
		gap = gap/(24*60*60)/1000;
		System.out.println("ũ������������ ���� �ϼ�: " + gap);
		
		cal.add(Calendar.DATE, -50);
		
		System.out.println("50�� ��: " + cal.get(Calendar.YEAR) + "�� " + (cal.get(Calendar.MONTH)+1) 
						+ "�� " + cal.get(Calendar.DATE) + "��");
	}

}
