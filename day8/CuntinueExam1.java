package com.day8;

import java.util.Scanner;

public class CuntinueExam1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("�� ���� ������ �Է��ϼ���(������ ���� ������ �Է�)");
			System.out.println("<0 �ι� �Է½� ����>");
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a == 0 && b == 0) break;
			if(a == 0 || b == 0) {
				System.out.println("������ �Ǵ� ������ 0�̹Ƿ� ������ �����մϴ�.");
				continue;
			}
			System.out.println("�� : " + a / b + ", ������ : " + a % b);
			
		}
		System.out.println("����Ǿ����ϴ�.");
		sc.close();

	}

}
