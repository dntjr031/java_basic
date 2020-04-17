package com.day24;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest2 {
	public static void main(String[] args) {
		String[] week = {"","��","��","ȭ","��","��","��","��"};
		
		Calendar date1 = Calendar.getInstance(); // public static Calendar getInstance()
		date1.set(2020, 5, 1); // 2020-06-01 ��
		
		int day = date1.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("���� : " + day);
		System.out.println("���� : " + week[day]);
		
		//��ĥ ��, �� ���� ��, �� �� �� ���
		Calendar date2 = new GregorianCalendar(2020,5,1); // 2020.06.01
		System.out.println("\n" + showDate(date2));
		
		//100����
		date2.add(Calendar.DATE, 100);
		System.out.println("100�� �� : " + showDate(date2));
		
		//2020.09.09 ���� 5���� ��
		date2.add(Calendar.MONTH, -5);
		System.out.println("5���� �� : " + showDate(date2));
		
		//2020.04.09 ���� 2�� ��
		date2.add(Calendar.YEAR, 2);
		System.out.println("2�� �� : " + showDate(date2));
		System.out.println();
	}
	
	public static String showDate(Calendar c) {
		return (c.get(Calendar.YEAR) + "�� " + (c.get(Calendar.MONTH)+1) + "�� " + c.get(Calendar.DATE) 
				+ "��");
	}
}
