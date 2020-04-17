package com.day11;

import java.util.Scanner;

public class ArrayParam {
	//��, ��, �� ������ �� �迭�� �Ű������� �޾� ����� �����ϴ� �޼���
	//�迭�� �Ű������� ���
	
	
	public static double findTotal(int[] score) {
		//call by reference : �Ű������� �ּҰ� �Ѿ
		//=> �޼��忡�� �Ű������� ���� �����ϸ� �ش� �޼��带 ȣ���� ��(main)������
		// ������ ������ �޴´�(���� ���浵�ϴ�)
		
		int sum = 0;
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		double avg = (double)sum/score.length;
		score[0]++; // �� ����  76 => 77
		
		return Math.round(avg*100)/100.0;
	}
	
	public static int add(int a, int b) {
		//call by value : �Ű������� ���� �Ѿ
		//=> �޼��忡�� �Ű������� ���� �����ص� �ش� �޼ҵ带 ȣ���� ��(main)������
		//������� �ʴ´�
		
		int c = a + b;
		a++;
		return c;
	}
	
	
	public static void main(String[] args) {
		
		int a = 5, b = 7;
		int result1 = add(a, b); //call by value
		System.out.println(result1 + ", a = " + a); //���� x
		
		
		int[] avg = {76,70,84};
		double result = findTotal(avg); //call by reference
		
		System.out.println("��� : " + result + ", avg[0] = " + avg[0]); // �� ���� �� 76 => 77

		
		int[] score = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("����, ����, ���� ������ �Է�");
		for(int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
		}
		
		double total = findTotal(score);
		
		System.out.println("��� : " + total);
		
		sc.close();

	}

}
