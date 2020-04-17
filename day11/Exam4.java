package com.day11;

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double[] dArr = new double[5];
		for(int i = 0; i < dArr.length; i++) {
			System.out.println("잔고를 입력하세요");
			dArr[i] = sc.nextDouble();
		}
		
		System.out.println("이자율을 입력하세요");
		double interest = sc.nextDouble();
		
		
		for (int i = 0; i < dArr.length; i++) {
			dArr[i] *= (1 + interest/100);
		}
		for(double n : dArr) {
			System.out.println("이자가 반영된 잔고 조회 : " + Math.round(n));
		}
		sc.close();

	}

}
