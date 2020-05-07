package com.day9;

import java.util.Scanner;

public class MathodExam1 {

	public static void exam1() {
		System.out.println("Hello Java");
	}
	
	public static void exam2(int a) {
		for(int i = 0; i < a; i++) {
			System.out.println("Hello Java");
		}
	}
	
	public static int exam3() {
		int sum = 0;
		for(int i = 1; i <= 100; i += 2) {
			sum += i;
		}
		return sum;
	}
	
	public static double exam4(double a, double b) {
		double multi = a * b;
		return multi;
	}
	
	
	public static void main(String[] args) {
		
		exam1();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 개수 입력");
		int count = sc.nextInt();
		
		exam2(count);
		
		int result = exam3();
		System.out.println("1~100까지 홀수의 합 : " + result);

		System.out.println("곱할 두 실수 입력");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		double product = exam4(a, b);
		
		System.out.println(a + "*" + b + "=" + product);
		
		sc.close();
	}

}
