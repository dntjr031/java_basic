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
		
		System.out.println("�Ǹż����� �Է��ϼ���");
		int a = sc.nextInt();
		System.out.println("�Ǹ� �ݾ��� �Է��ϼ���");
		int b = sc.nextInt();
		
		double perPay = perPay(a, b);
		
		System.out.println("���� " + a + "�� ������ : " + perPay);
		
		System.out.println("\n========================\n");
		
		System.out.println("�� ���� �Է��ϼ���");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int result = addOdd(n1, n2);
		
		System.out.println(n1 + "�� " + n2 + "������ Ȧ���� �� = " + result);
		
		System.out.println("\n========================\n");
		
		System.out.println("���ڿ��� �Է��ϼ���");
		sc.nextLine();
		String str = sc.nextLine();
		
		String answer = "";
		if(numOrChar(str)) {
			answer = "�����Դϴ�.";
		}else {
			answer = "���ڰ� �ƴմϴ�.";
		}
		System.out.println(str + "�� " + answer);
		
		sc.close();
	}

}
