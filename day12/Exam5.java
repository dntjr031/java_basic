package com.day12;

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] score = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("10명의 수강생 점수를 입력하세요");
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
		
		System.out.println("A학점은 " + score[1] + "점 이상이 되어야 합니다.");
		
		sc.close();

	}

}
