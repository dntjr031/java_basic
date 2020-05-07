package com.day8;

import java.util.Scanner;

public class WhileExam4 {

	public static void main(String[] args) {
		// 두수 입력, 두 수 사이의 홀수 합
		Scanner sc = new Scanner(System.in);
		System.out.println("두수 입력");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int cng;
		if(a > b) {
			cng = b;
			b = a;
			a = cng;
		}
		
		if(a % 2 == 0) a++;
		
		int sum = 0;
		
		for(int i = a; i <= b; i += 2) {
			sum += i;
		}
		
		
		System.out.println(a + "~" + b + " 홀수의 합 = " + sum);

		System.out.println("================================");
		// 두수 입력, 짝수? 홀수?의 합 고르고 합계 구하기
		// 두수 입력, 1. 홀수의 합, 2. 짝수의 합 선택
		System.out.println("두수 입력");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(" 홀수의 합?(0) 짝수의 합?(1)");
		int choice = sc.nextInt();
		
		cng = 0;
		if(a > b) {
			cng += b;
			b = a;
			a = cng;
		}
		
		String sType = (choice == 0?"홀수":"짝수");
		
		sum = 0;
		if(a % 2 == 1) {
			for(int i = a + choice; i <= b; i += 2) {
				sum += i;
			}
		}else {
			for(int i = ++a - choice; i <= b; i += 2) {
				sum += i;
			}
		}
		
		System.out.println(sType + "의 합 = " + sum);
		sc.close();
	}

}
