package com.day15;

import java.util.Scanner;

public class PhoneInfo {

	private String name, phone, birth;

	public PhoneInfo(String name, String phone, String birth) {
		this.name = name;
		this.phone = phone;
		this.birth = birth;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void printInfo() {
		System.out.println("name: " + name);
		System.out.println("phone: " + phone);
		if(!(birth.isEmpty() || birth == null)) {
			System.out.println("birth: " + birth + "\n");
			return;
		}
		System.out.println();
	}
	
	public void Search(String name) {
		
	}
}

class PhoneBook{
	private static Scanner sc;

	public static void showMenu(){
		System.out.println("�����ϼ���...");
		System.out.println("1. ������ �Է�");
		System.out.println("2. ��ü ������ ��ȸ");
		System.out.println("3. ������ �˻�");
		System.out.println("4. ������ ����");
		System.out.println("5. ���α׷� ����");
		System.out.print("���� : ");
	}
	
	public static PhoneInfo inputData(){
		sc = new Scanner(System.in);
		
		System.out.println("������ �Է��� �����մϴ�.");
		System.out.print("�̸�: ");
		String name=sc.nextLine();
		System.out.print("��ȭ��ȣ: ");
		String phone=sc.nextLine();
		System.out.print("�������: ");
		String birth=sc.nextLine();
		
		PhoneInfo ph=new PhoneInfo(name, phone, birth);
		
		return ph;
	}
	
	public static int search(PhoneInfo[] ph, int i) {
		int sum=-1;
		System.out.print("�̸�: ");
		String st = sc.nextLine();
		for (int j = 0; j < i; j++) {
			if(ph[j].getName().equals(st)) {
				sum = j;
				break;
			}
		}
		return sum;
	}
	
	public static void delete(PhoneInfo[] ph, int search) {
		for (int j = search; j < ph.length-1; j++) {
			ph[j] = ph[j+1];
		}
	}
}
