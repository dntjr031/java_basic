package com.day14;

import java.util.Scanner;

public class GradeTest1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("����, ����, ���� ������ �Է��ϼ���");
		int k = sc.nextInt();
		int e = sc.nextInt();
		int m = sc.nextInt();
		
		int score = k + e + m;
		double grade = score/3.0;
		
		System.out.println("���� : " + score + ", ��� = " + grade);
		
		sc.close();

	}

}
