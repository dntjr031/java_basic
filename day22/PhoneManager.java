package com.day22;

import java.util.Scanner;

public class PhoneManager{
	
	private static Scanner sc = new Scanner(System.in);
	private static final int MAX = 100;
	private static PhoneInfo[] ph = new PhoneInfo[MAX];
	private String name, phone, major, year, work;
	private static int i = 0;
	
	public int showMenu() throws MenuChoiceException{
		System.out.println("�����ϼ���...");
		System.out.println("1. ������ �Է�");
		System.out.println("2. ��ü ������ ��ȸ");
		System.out.println("3. ������ �˻�");
		System.out.println("4. ������ ����");
		System.out.println("5. ���α׷� ����");
		System.out.print("���� : ");
		int n = sc.nextInt();
		sc.nextLine();
		if(!(n>0 && n<6)) {
			throw new MenuChoiceException(n);
		}
		return n;
	}
	
	public void InputData() throws MenuChoiceException{
		if(i == MAX) {
			System.out.println("���̻� �����͸� �Է��� �� �����ϴ�.");
			return;
		}
		System.out.println("\n"+(i+1)+"�� ������ �Է��� �����մϴ�.");
		System.out.println("1. �Ϲ�, 2. ����, 3. ȸ��");
		System.out.print("����>> ");
		int choice = sc.nextInt();
		sc.nextLine();
		if(choice<=0 || choice>3) {
			throw new MenuChoiceException(choice);
		}
		switch(choice) {
			case 1:
				readFriendInfo();
				break;
			case 2:
				readUnivFriendInfo();
				break;
			case 3:
				readCompanyFriendInfo();
				break;
			default: System.out.println("�߸��Է�");
		}
		System.out.println();
	}
	
	public void readFriendInfo() {
		System.out.print("\n�̸�: ");
		name=sc.nextLine();
		System.out.print("��ȭ��ȣ: ");
		phone=sc.nextLine();
		ph[i++] = new PhoneInfo(name, phone);
	}
	public void readUnivFriendInfo() {
		System.out.print("\n�̸�: ");
		name=sc.nextLine();
		System.out.print("��ȭ��ȣ: ");
		phone=sc.nextLine();
		System.out.print("����: ");
		major = sc.nextLine();
		System.out.print("�й�(����): ");
		year = sc.nextLine();
		ph[i++]=new UnivPhone(name, phone, major, year);
	}
	public void readCompanyFriendInfo() {
		System.out.print("\n�̸�: ");
		name=sc.nextLine();
		System.out.print("��ȭ��ȣ: ");
		phone=sc.nextLine();
		System.out.print("ȸ��: ");
		work = sc.nextLine();
		ph[i++] = new WorkPhone(name, phone, work);
	}
	
	public void totalPrint() {
		if(i == 0) {
			System.out.println("�����Ͱ� �����ϴ�.\n");
			return;
		}
		System.out.println("\n-----------��ü ������ ��ȸ-------------");
		for (int i = 0; i < PhoneManager.i; i++) {
			ph[i].printInfo();
			if(i < PhoneManager.i) System.out.println();
		}
		System.out.println("------------------------------------\n");
	}
	
	public void search() {
		if(i == 0) {
			System.out.println("�����Ͱ� �����ϴ�.\n");
			return;
		}
		System.out.println("\n--------------������ �˻�--------------");
		System.out.print("�̸�: ");
		String st = sc.nextLine();
		System.out.println(st + "���� �˻��մϴ�\n");
		for (int j = 0; j < i; j++) {
			if(ph[j].getName().equals(st)) {
				ph[j].printInfo();
				System.out.println("-----------------------------------\n");
				return;
			}
		}
	}
	
	public void delete() {
		if(i == 0) {
			System.out.println("�����Ͱ� �����ϴ�.\n");
			return;
		}
		System.out.println("\n--------------������ ����------------------");
		System.out.print("�̸�: ");
		String st = sc.nextLine();
		for (int j = 0; j < i; j++) {
			if(ph[j].getName().equals(st)) {
			
				for (int k = j; k < MAX-1; k++) {
					ph[k] = ph[k+1];
				}
				i--;
				System.out.println("-----------"+st+"���� ������ ���� �Ϸ�----------\n");
				return;
			}
		}
	}
	
}
