package com.day14;

import java.util.Scanner;

public class TemporaryTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 일한시간, 시간당 급여를 입력하세요");
		String name = sc.nextLine();
		int time = sc.nextInt();
		int pay = sc.nextInt();
		
		Temporary tem = new Temporary(name, time, pay);
		int total = tem.totalPay();
		System.out.println("고용형태 : 임시직");
		System.out.println("이름 : " + tem.getName());
		System.out.println("급여 : " + total);
		
		sc.close();
		
	}
	
}
