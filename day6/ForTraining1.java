package com.day6;

import java.util.Scanner;

public class ForTraining1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("�ݺ��ϰ� ���� Ƚ���� �Է��ϼ���");
		int count = sc.nextInt();
		
		for(int i = 0; i < count; i++) {
			System.out.println("����ִ� java!");
		}
		System.out.println("===============");
		
		for(int i = 0; i < count; i++) {
			System.out.println("i=" + i);
		}
		System.out.println("===============");
		
		int sum = 0;
		for(int i = 0; i <= count; i++) {
			sum += i;
			System.out.println("i=" + i + ", sum=" + sum);
		}
		System.out.println("0���� n������ ��=" + sum);
		sc.close();

	}

}
