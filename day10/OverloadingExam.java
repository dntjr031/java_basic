package com.day10;

import java.util.Scanner;

public class OverloadingExam {
	
	public static int area(int a, int b) {
		int area = a*b;
		return area;
	}
	
	public static double area(int a) {
		double area = a*a*3.14;
		return area;
	}
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("����, ����, �������� �Է��ϼ���");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int square = area(a, b);
		double circle = area(c);
		
		System.out.println("����" + a + ", ����" + b + " �簢���� ���� : " + square);
		System.out.println("������" + c + "�� ���� ���� : " + circle);
		
		sc.close();

	}

}
