package com.day7;

import java.util.Scanner;

public class WhileExam2 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		while(true) {
			System.out.println("���ڸ� �Է��ϼ���(�������� 0 �Է�)");
			int num = sc.nextInt();
			
			if(num == 0) break;
			
			sum += num;
		}
		System.out.println("�Էµ� ������ �� : " + sum);
		
		
		System.out.println("\n=======��ü ���========\n");
		
		
		System.out.println("�Է��� ������ ������ �Է��ϼ���");
		int count = sc.nextInt();
		
		sum = 0;
		double cnt = 0;
		while(true) {
			
			System.out.println("������ �Է��ϼ���");
			int i = sc.nextInt();
			
			sum += i;
			cnt++;
			
			if(--count == 0) break;
			
		}
		long rnd = Math.round(sum / cnt * 100);
		
	
		System.out.println("�Էµ� ������ ��ü ��� : " + rnd / 100.0);
		
		sc.close();
			
	}

}
