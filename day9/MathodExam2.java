package com.day9;

import java.util.Scanner;

public class MathodExam2 {
	
	public static int big(int a, int b) {
		if(a > b) {
			return a;
		}else {
			return b;
		}
	}
	
	public static int remainder(int a, int b) {
		
		int c = a % b;
		return c;
				
	}

	public static void main(String[] args) {
		//[1]
		int n = big(1, 5);
		System.out.println("[1]\n1, 5�� �� ū�� : " + n + "\n");
		
		//[2]
		int num1 = 6, num2 = 4;
		n = big(num1, num2);
		System.out.println("[2]\n" + num1 + ", " + num2 + "�� �� ū�� : " + n + "\n");
		
		//[3]
		Scanner sc = new Scanner(System.in);
		System.out.println("[3]\n�� ū���� ���� �� ���� �Է��ϼ���");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		n = big(a, b);
		System.out.println(a + ", " + b + "�� �� ū�� : " + n);
		
		System.out.println("=============================");
		
		while(true) {
			System.out.println("������ ������ �� �� ���� �Է��ϼ���");
			a = sc.nextInt();
			b = sc.nextInt();
			
			if(a == 0 || b == 0) break;
			
			int remainder = remainder(a, b);
			System.out.println("������ ���� ��� : " + a + "%" + b + " = " + remainder);
			
		}
		System.out.println("����Ǿ����ϴ�.");
		sc.close();

	}

}
