package com.day6;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����, ����, ���� ������ �Է��ϼ���");
		double k = sc.nextDouble();
		double e = sc.nextDouble();
		double m = sc.nextDouble();
		
		double average = (k + e + m)/3;
		String result = "";
		
		if(average >= 70 ) {
			if(m >= 50 && e >= 50 && k >= 50) {
				result = "�հ�";
			}else {
				result = "����";
			}
		}else {
			result = "���հ�";
		}
		
		int averageInt = (int)(average/10);
		String grade = "";
		switch(averageInt) {
			case 10: case 9:
				grade = "A";
				break;
			case 8:
				grade = "B";
				break;
			case 7:
				grade = "C";
				break;
			case 6:
				grade = "D";
				break;
			default:
				grade = "F";
				
		}
		
		System.out.println("��� : " + average + ", ���� : " + grade);
		System.out.println("�հݿ��� : " + result);
		sc.close();

	}

}
