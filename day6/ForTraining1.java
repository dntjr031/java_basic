package com.day6;

import java.util.Scanner;

public class ForTraining1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("반복하고 싶은 횟수를 입력하세요");
		int count = sc.nextInt();
		
		for(int i = 0; i < count; i++) {
			System.out.println("재미있는 java!");
		}
		System.out.println("===============");
		
		for(int i = 0; i < count; i++) {
			System.out.println("i=" + i);
		}
		System.out.println("===============");
		
		int sum = 0;
		for(int i = 0; i <= count; i++) {
			sum += i;
			System.out.println("i=" + i + ", sum=" + sum);
		}
		System.out.println("0부터 n까지의 합=" + sum);
		sc.close();

	}

}
