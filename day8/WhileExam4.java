package com.day8;

import java.util.Scanner;

public class WhileExam4 {

	public static void main(String[] args) {
		// �μ� �Է�, �� �� ������ Ȧ�� ��
		Scanner sc = new Scanner(System.in);
		System.out.println("�μ� �Է�");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int cng;
		if(a > b) {
			cng = b;
			b = a;
			a = cng;
		}
		
		if(a % 2 == 0) a++;
		
		int sum = 0;
		
		for(int i = a; i <= b; i += 2) {
			sum += i;
		}
		
		
		System.out.println(a + "~" + b + " Ȧ���� �� = " + sum);

		System.out.println("================================");
		// �μ� �Է�, ¦��? Ȧ��?�� �� ���� �հ� ���ϱ�
		// �μ� �Է�, 1. Ȧ���� ��, 2. ¦���� �� ����
		System.out.println("�μ� �Է�");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(" Ȧ���� ��?(0) ¦���� ��?(1)");
		int choice = sc.nextInt();
		
		cng = 0;
		if(a > b) {
			cng += b;
			b = a;
			a = cng;
		}
		
		String sType = (choice == 0?"Ȧ��":"¦��");
		
		sum = 0;
		if(a % 2 == 1) {
			for(int i = a + choice; i <= b; i += 2) {
				sum += i;
			}
		}else {
			for(int i = ++a - choice; i <= b; i += 2) {
				sum += i;
			}
		}
		
		System.out.println(sType + "�� �� = " + sum);
		sc.close();
	}

}
