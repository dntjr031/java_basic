package com.day25;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ParseExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��¥�� �Է��ϼ���(2013/09/30)");
		String s = sc.nextLine();
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy�� MM�� dd�� E");
		
		try {
			Date date = sdf.parse(s);
			String sdate = sdf2.format(date);
			System.out.println(sdate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		sc.close();
	}

}
