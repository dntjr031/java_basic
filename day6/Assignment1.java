package com.day6;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어, 영어, 수학 점수를 입력하세요");
		double k = sc.nextDouble();
		double e = sc.nextDouble();
		double m = sc.nextDouble();
		
		double average = (k + e + m)/3;
		String result = "";
		
		if(average >= 70 ) {
			if(m >= 50 && e >= 50 && k >= 50) {
				result = "합격";
			}else {
				result = "과락";
			}
		}else {
			result = "불합격";
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
		
		System.out.println("평균 : " + average + ", 학점 : " + grade);
		System.out.println("합격여부 : " + result);
		sc.close();

	}

}
