package com.day21;

import java.util.Scanner;

public class TryTest1 {

	public static void main(String[] args) {
		System.out.println("====���� ó������ ���� ���====");
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� �Է�!");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int result = n1/n2; //n2 �� 0�� ��� ArithmeticException / by zero
							// ���ܰ� �߻��ϸ� ������ ����
		System.out.println("������ ��� : " + result);
		
		sc.close();
		
	}

}
