package com.day9;

import java.util.Scanner;

public class MathodExam3 {
	
	public static float toCm(float inch) {
		float cm = inch * 2.54f;
		return cm;
	}
	
	public static float toInch(float cm) {
		float inch = cm / 2.54f;
		return inch;
	}
	
	public static double area(double a, double b) {
		double area = a * b / 2;
		return area;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("변환하려는 inch를 입력하세요");
		float inch = sc.nextFloat();
		float result = toCm(inch);
		System.out.println(inch + "inch => " + result + "cm");
		
		System.out.println("변환하려는 cm를 입력하세요");
		float cm = sc.nextFloat();
		result = toInch(cm);
		System.out.println(cm + "cm => " + result + "inch");
		
		System.out.println("\n===================\n");
		
		System.out.println("삼각형의 밑변의 길이, 높이를 입력하세요");
		double m = sc.nextDouble();
		double h = sc.nextDouble();
		
		double area = area(m, h);
		System.out.println("삼각형의 면적 : " + area);
		
		sc.close();

	}

}
