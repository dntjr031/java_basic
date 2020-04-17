package com.day24;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountManager {
	static Scanner sc = new Scanner(System.in);
	ArrayList<Account> arr = new ArrayList<Account>();
	
	public int input() {
		System.out.println("-----Menu-----");
		System.out.println("1. ���°���");
		System.out.println("2. ��      ��");
		System.out.println("3. ��      ��");
		System.out.println("4. ��ü���");
		System.out.println("5. ��      ��");
		System.out.print("���� : ");
		int n = sc.nextInt();
		sc.nextLine();
		return n;
		
	}
	
	public void accountInput() {
		System.out.println("\n[������������]");
		System.out.println("1. ���뿹�ݰ���");
		System.out.println("2. �ſ�ŷڰ���");
		System.out.print("����: ");
		int n = sc.nextInt();
		sc.nextLine();
		if(n == 1) {
			arr.add(NormalAccountInput());
		}else if(n == 2) {
			arr.add(HighCreditAccountInput());
		}else {
			System.out.println("�߸��Է�\n");
			return;
		}
		System.out.println("���� �Ϸ�!\n");
	}
	
	private Account NormalAccountInput() {
		System.out.println("\n[���뿹�ݰ��� ����]");
		System.out.print("����ID: ");
		String accId = sc.nextLine();
		System.out.print("�̸�: ");
		String accName = sc.nextLine();
		System.out.print("�Աݾ�: ");
		int balance = sc.nextInt();
		sc.nextLine();
		System.out.print("������: ");
		int iNTERAST_RATE = sc.nextInt();
		sc.nextLine();
		
		Account acc = new NormalAccount(accId, accName, balance, iNTERAST_RATE);
		return acc;
	}
	
	private Account HighCreditAccountInput() {
		System.out.println("\n[���뿹�ݰ��� ����]");
		System.out.print("����ID: ");
		String accId = sc.nextLine();
		System.out.print("�̸�: ");
		String accName = sc.nextLine();
		System.out.print("�Աݾ�: ");
		int balance = sc.nextInt();
		sc.nextLine();
		System.out.print("������: ");
		int iNTERAST_RATE = sc.nextInt();
		sc.nextLine();
		System.out.print("\n�ſ���(A, B, C): ");
		String grade = sc.nextLine();
		
		Account acc = new HighCreditAccount(accId, accName, balance, iNTERAST_RATE, grade);
		return acc;
	}
	
	public void totalInfo() {
		if(arr.isEmpty()) {
			System.out.println("������ ���°� �����ϴ�.\n");
			return;
		}
		System.out.println("\n======��ü �� ����======");
		for (int i = 0; i < arr.size(); i++) {
			arr.get(i).showInfo();
			System.out.println();
		}
		System.out.println("======================");
	}
	
	public void arrIn() {
		if(arr.isEmpty()) {
			System.out.println("������ ���°� �����ϴ�.\n");
			return;
		}
		System.out.println("\n[��      ��]");
		System.out.print("����ID: ");
		String accId = sc.nextLine();
		System.out.print("�Աݾ�: ");
		int money = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < arr.size(); i++) {
			if((arr.get(i).getAccId()).equals(accId)) {
				arr.get(i).accIn(money);
				System.out.println("�ԱݿϷ�\n");
				return;
			}
		}
		System.out.println("��ȿ���� ���� ID�Դϴ�.\n");
	}
	
	public void arrout() {
		if(arr.isEmpty()) {
			System.out.println("������ ���°� �����ϴ�.\n");
			return;
		}
		System.out.println("\n[��      ��]");
		System.out.print("����ID: ");
		String accId = sc.nextLine();
		System.out.print("��ݾ�: ");
		int money = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < arr.size(); i++) {
			if((arr.get(i).getAccId()).equals(accId)) {
				int n = arr.get(i).accOut(money);
				if(n == 0) {
					System.out.println("�ܾ׺���\n");
				}else {
					System.out.println("��ݿϷ�\n");
				}
				return;
			}
		}
		System.out.println("��ȿ���� ���� ID�Դϴ�.\n");
	}
}
