package com.day8;

import java.util.Scanner;

public class CuntinueExam1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("두 개의 정수를 입력하세요(피제수 제수 순으로 입력)");
			System.out.println("<0 두번 입력시 종료>");
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a == 0 && b == 0) break;
			if(a == 0 || b == 0) {
				System.out.println("피제수 또는 제수가 0이므로 연산을 생략합니다.");
				continue;
			}
			System.out.println("몫 : " + a / b + ", 나머지 : " + a % b);
			
		}
		System.out.println("종료되었습니다.");
		sc.close();

	}

}
