package com.day6;

import java.util.Scanner;

public class ForTest3 {

	public static void main(String[] args) {

		// 1~3���� �� ���ϱ�
		/*
		 sum = 0
		 sum = sum + i
		 
		 			 sum  + i
		 -----------------------
		 i : 1		  0   + 1
		 	 2		 0+1  + 2
		 	 3		0+1+2 + 3
		 */
		int sum = 0;
		for(int i = 1; i <= 3; i++) {
			sum += i;
			//System.out.println("i : " + i + ", sum=" + sum); for�� �ۿ� ���� ��
		} //for
		
		System.out.println("1~3������ �� : " + sum);

		//1~50 Ȧ���� ��
		
		sum = 0;
		 for(int i = 1; i <= 50; i += 2) {
			 sum += i;
		 }
		System.out.println("Ȧ���� �� : " + sum);
		
		// 1~����� �Է°� ���� ¦���� ��
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1~n ������ ¦���� �� : n(����)�� �Է��Ͻÿ�");
		int count = sc.nextInt();
		
		sum = 0;
		for(int i = 0; i <= count; i += 2) {
			sum += i;
		}
		System.out.println("�Է��� �������� ¦�� �� : " + sum);
		sc.close();
	}

}
