package com.day6;

import java.util.Scanner;

public class ForTest3 {

	public static void main(String[] args) {

		// 1~3까지 합 구하기
		/*
		 sum = 0
		 sum = sum + i
		 
		 			 sum  + i
		 -----------------------
		 i : 1		  0   + 1
		 	 2		 0+1  + 2
		 	 3		0+1+2 + 3
		 */
		int sum = 0;
		for(int i = 1; i <= 3; i++) {
			sum += i;
			//System.out.println("i : " + i + ", sum=" + sum); for문 밖에 찍어야 함
		} //for
		
		System.out.println("1~3까지의 합 : " + sum);

		//1~50 홀수의 합
		
		sum = 0;
		 for(int i = 1; i <= 50; i += 2) {
			 sum += i;
		 }
		System.out.println("홀수의 합 : " + sum);
		
		// 1~사용자 입력값 까지 짝수의 합
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1~n 까지의 짝수의 합 : n(정수)을 입력하시오");
		int count = sc.nextInt();
		
		sum = 0;
		for(int i = 0; i <= count; i += 2) {
			sum += i;
		}
		System.out.println("입력한 값까지의 짝수 합 : " + sum);
		sc.close();
	}

}
