package com.day16;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		KBAccount acc = new KBAccount();
		System.out.println("���¹�ȣ, �ܾ�, ��ü�ѵ��� �Է��ϼ���");
		acc.setAccNum(sc.nextLine());
		acc.setBalance(sc.nextInt());
		acc.setTransferLimit(sc.nextInt());
		sc.nextLine();
		
		System.out.println("===============================");
		acc.printInfo();
		
		sc.close();
	}

}
