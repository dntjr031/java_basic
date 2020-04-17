package com.day14;

import java.util.Scanner;

public class GradeTest1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("국어, 영어, 수학 점수를 입력하세요");
		int k = sc.nextInt();
		int e = sc.nextInt();
		int m = sc.nextInt();
		
		int score = k + e + m;
		double grade = score/3.0;
		
		System.out.println("총점 : " + score + ", 평균 = " + grade);
		
		sc.close();

	}

}
