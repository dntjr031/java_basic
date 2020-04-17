package com.day9;

import java.util.Scanner;

public class CalculateTest {

	public static void main(String[] args) {
		//[1]
		int result = add(10, 50);
		System.out.println("두 수의 합 : " + result);
		
		//[2]
		int n1 = 7, n2 = 9;
		int res = add(n1, n2);
		System.out.println("\n" + n1 + "과 " + n2 + "의 합 : " + res);
		
		//[3]
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n두 정수 입력!");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int value = add(num1, num2);
		
		System.out.println(num1 + " + " + num2 + " = " + value);
		
		
		
		//[1]
		float f = minus(3.14f, 10.2f);
		System.out.println("\n두 실수의 차 : " + f);
		
		//[2]
		float f1 = 3.14f, f2 = 10.2f;
		f = minus(f1, f2);
		System.out.println("\n" + f1 + "-" + f2 + "=" + f);
		
		//[3]
		System.out.println("\n두 실수 입력");
		float m1 = sc.nextFloat();
		float m2 = sc.nextFloat();
		f = minus(m1, m2);
		System.out.println(m1 + "-" + m2 + "=" + f);
		
		sc.close();
	}
	
	public static int add(int a, int b) {
		int c = a + b;
		
		return c;
	}
	
	public static float minus(float a, float b) {
		float c = a - b;
		
		return c;
	}
}
