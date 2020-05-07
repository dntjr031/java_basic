package com.day6;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("3의 배수의 개수를 입력하세요");
		int count = sc.nextInt();
		
		for(int i = 1; i <= count; i++) {
			System.out.print(i * 3 + "\t");
		}
		
		System.out.println("\n=====================");
		
		System.out.println("n의 계승 구하기 : n을 입력하세요");
		int facto = sc.nextInt();
		
		long num = 1l;
		for(int i = 1; i <= facto; i++) {
			num *= i;
		}
		System.out.println("1~n까지의 곱 : " + num);
		
		sc.close();
	}

}
