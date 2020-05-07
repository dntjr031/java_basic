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
		
		System.out.println("가로, 세로, 반지름을 입력하세요");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int square = area(a, b);
		double circle = area(c);
		
		System.out.println("가로" + a + ", 세로" + b + " 사각형의 면적 : " + square);
		System.out.println("반지름" + c + "인 원의 면적 : " + circle);
		
		sc.close();

	}

}
