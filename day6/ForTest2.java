package com.day6;

import java.util.Scanner;

public class ForTest2 {

	public static void main(String[] args) {

		//����ڷκ��� �ݺ� Ƚ���� �Է¹޾Ƽ� �� Ƚ����ŭ hi java����ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ݺ��ϰ� ���� Ƚ���� �Է��ϼ���");
		int count = sc.nextInt();
		
		for(int i = 0; i < count; i++) {
			System.out.println(i + " : Hi java");
		}
		sc.close();
	}

}
