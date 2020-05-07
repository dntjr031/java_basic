package com.day18;

import java.util.Scanner;

public class Test51p {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("고용형태 - 고용직(P), 임시직(T)을 입력하세요");
		String str = sc.nextLine();
		if(str.equalsIgnoreCase("P")) {
			System.out.println("이름, 기본급여, 보너스를 입력하세요.");
			String name = sc.nextLine();
			int sALARY = sc.nextInt();
			int bonus = sc.nextInt();
			sc.nextLine();
			
			Permanent p = new Permanent(name, sALARY, bonus);
			System.out.println("-----------------------------------");
			System.out.println("고용형태:고용직");
			System.out.println("이름:" + p.getName());
			System.out.println("급여:" + p.findPay());
			
		}else if(str.equalsIgnoreCase("T")) {
			System.out.println("이름, 일한시간, 시간당급여를 입력하세요.");
			String name = sc.nextLine();
			int time = sc.nextInt();
			int pay = sc.nextInt();
			sc.nextLine();
			
			Temporary t = new Temporary(name, time, pay);
			System.out.println("-----------------------------------");
			System.out.println("고용형태:임시직");
			System.out.println("이름:" + t.getName());
			System.out.println("급여:" + t.findPay());
		}else {
			System.out.println("잘못입력하였습니다.");
		}
		sc.close();
		
	}

}
