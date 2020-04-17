package com.day25;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ParseTest {

	public static void main(String[] args) {
		Date today = new Date();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("오늘 이전 날짜를 입력(yyyy-mm-dd)");
		String date = sc.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		//public Date parse(String source) throws ParseException
		try {
			Date d = sdf.parse(date);
			long gap = 0l;
			String s = sdf.format(today); // 오늘 잘짜에서 시분초 뺀것
			Date today2 = sdf.parse(s);
			
			if(today.getTime() < d.getTime()) { //미래 날짜
				gap = (d.getTime() - today2.getTime())/1000;
			}else { // 과거 날짜
				gap = (today2.getTime() - d.getTime())/1000;
			}
			gap = gap/(24*60*60);
			
			System.out.println("\n두 날짜 사이 경과된 일수 : " + gap + "일");
		} catch (ParseException e) {
			System.out.println(e.getMessage());
			
		}
		
		sc.close();
	}

}
