package com.day10;

import java.util.Scanner;

public class MathodExam {
	
	public static double perPay(int a, int b) {
		
		double result = 0;
		if(a >= 200) {
			result = b * 0.35;
		}else if(a >= 100) {
			result = b * 0.25;
		}else {
			result = b * 0.15;
		}
		return result;
	}
	
	public static int addOdd(int a, int b) {
		
		int c = 0;
		if(a > b) {
			c = a;
			a = b;
			b = c;
		}
		
		int sum = 0;
		if(a % 2 == 0) ++a;
		
		for(int i = a; i <= b; i += 2) {
				sum += i;
		}
		return sum;
	}
	
	public static boolean numOrChar(String str) {
		
		boolean result = true;
		for(int i = 0; i < str.length(); i++) {
			
			if(!(str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
				result = false;
			
				break;
			}
		}
		
		return result;
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("판매수량을 입력하세요");
		int a = sc.nextInt();
		System.out.println("판매 금액을 입력하세요");
		int b = sc.nextInt();
		
		double perPay = perPay(a, b);
		
		System.out.println("수량 " + a + "의 성과급 : " + perPay);
		
		System.out.println("\n========================\n");
		
		System.out.println("두 수를 입력하세요");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int result = addOdd(n1, n2);
		
		System.out.println(n1 + "과 " + n2 + "사이의 홀수의 합 = " + result);
		
		System.out.println("\n========================\n");
		
		System.out.println("문자열을 입력하세요");
		sc.nextLine();
		String str = sc.nextLine();
		
		String answer = "";
		if(numOrChar(str)) {
			answer = "숫자입니다.";
		}else {
			answer = "숫자가 아닙니다.";
		}
		System.out.println(str + "은 " + answer);
		
		sc.close();
	}

}
