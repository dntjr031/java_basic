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
		
		System.out.println("��ȯ�Ϸ��� inch�� �Է��ϼ���");
		float inch = sc.nextFloat();
		float result = toCm(inch);
		System.out.println(inch + "inch => " + result + "cm");
		
		System.out.println("��ȯ�Ϸ��� cm�� �Է��ϼ���");
		float cm = sc.nextFloat();
		result = toInch(cm);
		System.out.println(cm + "cm => " + result + "inch");
		
		System.out.println("\n===================\n");
		
		System.out.println("�ﰢ���� �غ��� ����, ���̸� �Է��ϼ���");
		double m = sc.nextDouble();
		double h = sc.nextDouble();
		
		double area = area(m, h);
		System.out.println("�ﰢ���� ���� : " + area);
		
		sc.close();

	}

}
