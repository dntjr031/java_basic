package com.day24;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ParseTest {

	public static void main(String[] args) {
		Date today = new Date();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� ��¥�� �Է�(yyyy-mm-dd)");
		String date = sc.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		
		//public Date parse(String source) throws ParseException
		try {
			Date d = sdf.parse(date);
			
			long gap = (today.getTime() - d.getTime())/1000;
			gap = gap/(24*60*60);
			
			System.out.println("\n�� ��¥ ���� ����� �ϼ� : " + gap + "��");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		sc.close();
	}

}
