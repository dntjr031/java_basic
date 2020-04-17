package com.day8;

import java.util.Scanner;

public class WhileExam1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 개의 정수를 입력하세요");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		int sum = 0;
		if (a > b) {
			for(int i = b; i <= a; i++) {
				sum += i;
			}
			
		}else if(a < b) {
			for(int i = a; i <= b; i++) {
				sum += i;
			}
		}else {
			sum += a;
		}
		
		System.out.println("\n" + a + "~" + b +"사이의 정수의 합 : " +sum);
		
		//swap - 서로 바꾸다
		System.out.println("두 개의 정수를 입력하세요");
		a = sc.nextInt();
		b = sc.nextInt();
		
		int temp = 0;
		if(a>b) {
			temp = a;
			a = b;
			b = temp;
		} // 스왑
		
		sum = 0;
		for(int i = a; i <= b; i++) {
			sum += i;
		}//for
		
		System.out.println("\n" + a + "~" + b +"사이의 정수의 합 : " +sum);
		
		sc.close();

	}

}
