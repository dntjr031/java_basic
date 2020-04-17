package com.day14;

import java.util.Scanner;

public class TimeTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("시, 분, 초 입력!");
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int sec = sc.nextInt();
		
		Time t = new Time(hour, min, sec);
		
		int toSec = t.toSec();
		
		System.out.println("초로 환산 하면 => " + toSec + "초");
		
		//setter를 이용해서 멤버변수의 값 변경
		t.setHour(12);
		t.setMin(13);
		t.setSec(50);
		
		//getter를 이용해서 멤버변수의 값 읽어오기
		System.out.println("\n\n------변경된 시간------");
		System.out.println(t.getHour() + "시 " + t.getMin() + "분 " + t.getSec() + "초");
		System.out.println("초로 환산 : " + t.toSec() + "초");
		
		sc.close();

	}

}
