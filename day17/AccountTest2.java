package com.day17;

import java.util.Scanner;

public class AccountTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�Ա��� �ݾ��� �Է��ϼ���");
		int money = sc.nextInt();
		int interest = Account2.carcRate(money);
		
		System.out.println("=======================");
		System.out.println("���� : " + money + "��, ������ : " + 
						Account2.INTEREST_RATE + ", ���� : " + interest + "��");

		sc.close();
	}

}

class Account2{
	public static final double INTEREST_RATE = 0.02;
	
	public static int carcRate(int a) {
		return (int)(a*INTEREST_RATE);
	}
}