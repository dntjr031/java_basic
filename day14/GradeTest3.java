package com.day14;

import java.util.Scanner;

public class GradeTest3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����, ����, ���� ������ �Է��ϼ���");
		int k = sc.nextInt();
		int e = sc.nextInt();
		int m = sc.nextInt();
		
		Grade g = new Grade(k, e, m);
		
		int score = g.score();
		double grade = g.grade();
		
		System.out.println("���� : " + score + ", ��� = " + grade);
		
		while(true) {
			System.out.println("\n����Ͻðڽ��ϱ�? 1.��� 2.����");
			int a = sc.nextInt();
			if(a != 1) break;
			
			System.out.println("\n����, ����, ���� ������ �Է��ϼ���");
			k = sc.nextInt();
			e = sc.nextInt();
			m = sc.nextInt();
			
			g.setKor(k);
			g.setEng(e);
			g.setMath(m);
			
			score = g.score();
			grade = g.grade();
			
			System.out.println("���� : " + score + ", ��� = " + grade);
		}
		
		System.out.println("����Ǿ����ϴ�.");
		sc.close();

	}

}
