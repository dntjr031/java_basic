package com.day8;

import java.util.Scanner;

public class WhileExam1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ���� ������ �Է��ϼ���");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		int sum = 0;
		if (a > b) {
			for(int i = b; i <= a; i++) {
				sum += i;
			}
			
		}else if(a < b) {
			for(int i = a; i <= b; i++) {
				sum += i;
			}
		}else {
			sum += a;
		}
		
		System.out.println("\n" + a + "~" + b +"������ ������ �� : " +sum);
		
		//swap - ���� �ٲٴ�
		System.out.println("�� ���� ������ �Է��ϼ���");
		a = sc.nextInt();
		b = sc.nextInt();
		
		int temp = 0;
		if(a>b) {
			temp = a;
			a = b;
			b = temp;
		} // ����
		
		sum = 0;
		for(int i = a; i <= b; i++) {
			sum += i;
		}//for
		
		System.out.println("\n" + a + "~" + b +"������ ������ �� : " +sum);
		
		sc.close();

	}

}
