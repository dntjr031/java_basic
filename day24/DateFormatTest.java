package com.day24;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		Date date = cal.getTime();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS a");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd E����");
		
		String str = sdf1.format(date);
		System.out.println("����� : " + str);
		str = sdf2.format(date);
		System.out.println("����� �ú��� : " + str);
		str = sdf3.format(date);
		System.out.println("����� �ú��� ����/����: " + str);
		str = sdf4.format(date);
		System.out.println("����� ����: " + str);
	}

}
