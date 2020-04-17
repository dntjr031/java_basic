package com.day14;

import java.util.Scanner;

public class GradeTest3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어, 영어, 수학 점수를 입력하세요");
		int k = sc.nextInt();
		int e = sc.nextInt();
		int m = sc.nextInt();
		
		Grade g = new Grade(k, e, m);
		
		int score = g.score();
		double grade = g.grade();
		
		System.out.println("총점 : " + score + ", 평균 = " + grade);
		
		while(true) {
			System.out.println("\n계속하시겠습니까? 1.계속 2.종료");
			int a = sc.nextInt();
			if(a != 1) break;
			
			System.out.println("\n국어, 영어, 수학 점수를 입력하세요");
			k = sc.nextInt();
			e = sc.nextInt();
			m = sc.nextInt();
			
			g.setKor(k);
			g.setEng(e);
			g.setMath(m);
			
			score = g.score();
			grade = g.grade();
			
			System.out.println("총점 : " + score + ", 평균 = " + grade);
		}
		
		System.out.println("종료되었습니다.");
		sc.close();

	}

}
