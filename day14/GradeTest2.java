package com.day14;

import java.util.Scanner;

public class GradeTest2 {
	
	public static int score(int a, int b, int c) {
		return a + b + c;
	}
	
	public static double grade(int a) {
		return a / 3.0;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어, 영어, 수학 점수를 입력하세요");
		int k = sc.nextInt();
		int e = sc.nextInt();
		int m = sc.nextInt();
		
		int score = score(k, e, m);
		double grade = grade(score);
		
		System.out.println("총점 : " + score + ", 평균 = " + grade);
		
		sc.close();

	}

}
