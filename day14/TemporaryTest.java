package com.day14;

import java.util.Scanner;

public class TemporaryTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸�, ���ѽð�, �ð��� �޿��� �Է��ϼ���");
		String name = sc.nextLine();
		int time = sc.nextInt();
		int pay = sc.nextInt();
		
		Temporary tem = new Temporary(name, time, pay);
		int total = tem.totalPay();
		System.out.println("������� : �ӽ���");
		System.out.println("�̸� : " + tem.getName());
		System.out.println("�޿� : " + total);
		
		sc.close();
		
	}
	
}
