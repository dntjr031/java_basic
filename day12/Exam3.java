package com.day12;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {

		int[] coinUnit = {500,100,50,10};
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("거스름돈을 입력하세요.<종료시 0>");
			int money = sc.nextInt();
			if(money == 0) break;
			
			int cng = money;
			for (int i = 0; i < coinUnit.length; i++) {
				 cng = money / coinUnit[i];
				 money %= coinUnit[i];
				 System.out.println(coinUnit[i] + "원: " + cng);
			}
		}
		System.out.println("종료되었습니다.");
		
		sc.close();

	}

}
