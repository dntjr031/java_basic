package com.day11;

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double[] dArr = new double[5];
		for(int i = 0; i < dArr.length; i++) {
			System.out.println("�ܰ� �Է��ϼ���");
			dArr[i] = sc.nextDouble();
		}
		
		System.out.println("�������� �Է��ϼ���");
		double interest = sc.nextDouble();
		
		
		for (int i = 0; i < dArr.length; i++) {
			dArr[i] *= (1 + interest/100);
		}
		for(double n : dArr) {
			System.out.println("���ڰ� �ݿ��� �ܰ� ��ȸ : " + Math.round(n));
		}
		sc.close();

	}

}
