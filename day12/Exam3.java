package com.day12;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {

		int[] coinUnit = {500,100,50,10};
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("�Ž������� �Է��ϼ���.<����� 0>");
			int money = sc.nextInt();
			if(money == 0) break;
			
			int cng = money;
			for (int i = 0; i < coinUnit.length; i++) {
				 cng = money / coinUnit[i];
				 money %= coinUnit[i];
				 System.out.println(coinUnit[i] + "��: " + cng);
			}
		}
		System.out.println("����Ǿ����ϴ�.");
		
		sc.close();

	}

}
