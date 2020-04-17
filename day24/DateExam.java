package com.day24;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateExam {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("오늘날짜 : yyyy-MM-dd E요일 hh:mm:ss a");
		Date date = new Date();
		System.out.println(sdf.format(date));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력");
		long n = sc.nextInt();
		DecimalFormat df = new DecimalFormat("#,###");
		String st = df.format(n);
		System.out.println(st);
		
		sc.close();
	}

}
