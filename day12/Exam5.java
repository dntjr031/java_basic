package com.day12;

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] score = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("10���� ������ ������ �Է��ϼ���");
			score[i] = sc.nextInt();
		}
		
	
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < i; j++) {
				if(score[i] > score[j]) {
					int cng = score[j];
					score[j] = score[i];
					score[i] = cng;
				}
				
			}
		}
		
		System.out.println("A������ " + score[1] + "�� �̻��� �Ǿ�� �մϴ�.");
		
		sc.close();

	}

}
