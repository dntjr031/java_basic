package com.day15;

import java.util.Scanner;

public class AccountTest2 {

	public static void main(String[] args) {
		
		Account[] accArr = new Account[4];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < accArr.length; i++) {
			System.out.println("���¹�ȣ, �ܾ�, ��ݾ��� �Է��ϼ���");
			String accId = sc.nextLine();
			int bal = sc.nextInt();
			int money = sc.nextInt();
			sc.nextLine();
			
			accArr[i] = new Account(accId, bal);
			accArr[i].withdraw(money);
		}
		
		System.out.println("\n======���� �� ����Ʈ======");
		for (int i = 0; i < accArr.length; i++) {
			accArr[i].showInfo();
		}
		
		sc.close();
	}
}
