package com.day22;

import java.util.Scanner;

public class PhoneManager{
	
	private static Scanner sc = new Scanner(System.in);
	private static final int MAX = 100;
	private static PhoneInfo[] ph = new PhoneInfo[MAX];
	private String name, phone, major, year, work;
	private static int i = 0;
	
	public int showMenu() throws MenuChoiceException{
		System.out.println("선택하세요...");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 전체 데이터 조회");
		System.out.println("3. 데이터 검색");
		System.out.println("4. 데이터 삭제");
		System.out.println("5. 프로그램 종료");
		System.out.print("선택 : ");
		int n = sc.nextInt();
		sc.nextLine();
		if(!(n>0 && n<6)) {
			throw new MenuChoiceException(n);
		}
		return n;
	}
	
	public void InputData() throws MenuChoiceException{
		if(i == MAX) {
			System.out.println("더이상 데이터를 입력할 수 없습니다.");
			return;
		}
		System.out.println("\n"+(i+1)+"번 데이터 입력을 시작합니다.");
		System.out.println("1. 일반, 2. 대학, 3. 회사");
		System.out.print("선택>> ");
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
			default: System.out.println("잘못입력");
		}
		System.out.println();
	}
	
	public void readFriendInfo() {
		System.out.print("\n이름: ");
		name=sc.nextLine();
		System.out.print("전화번호: ");
		phone=sc.nextLine();
		ph[i++] = new PhoneInfo(name, phone);
	}
	public void readUnivFriendInfo() {
		System.out.print("\n이름: ");
		name=sc.nextLine();
		System.out.print("전화번호: ");
		phone=sc.nextLine();
		System.out.print("전공: ");
		major = sc.nextLine();
		System.out.print("학번(연도): ");
		year = sc.nextLine();
		ph[i++]=new UnivPhone(name, phone, major, year);
	}
	public void readCompanyFriendInfo() {
		System.out.print("\n이름: ");
		name=sc.nextLine();
		System.out.print("전화번호: ");
		phone=sc.nextLine();
		System.out.print("회사: ");
		work = sc.nextLine();
		ph[i++] = new WorkPhone(name, phone, work);
	}
	
	public void totalPrint() {
		if(i == 0) {
			System.out.println("데이터가 없습니다.\n");
			return;
		}
		System.out.println("\n-----------전체 데이터 조회-------------");
		for (int i = 0; i < PhoneManager.i; i++) {
			ph[i].printInfo();
			if(i < PhoneManager.i) System.out.println();
		}
		System.out.println("------------------------------------\n");
	}
	
	public void search() {
		if(i == 0) {
			System.out.println("데이터가 없습니다.\n");
			return;
		}
		System.out.println("\n--------------데이터 검색--------------");
		System.out.print("이름: ");
		String st = sc.nextLine();
		System.out.println(st + "님을 검색합니다\n");
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
			System.out.println("데이터가 없습니다.\n");
			return;
		}
		System.out.println("\n--------------데이터 삭제------------------");
		System.out.print("이름: ");
		String st = sc.nextLine();
		for (int j = 0; j < i; j++) {
			if(ph[j].getName().equals(st)) {
			
				for (int k = j; k < MAX-1; k++) {
					ph[k] = ph[k+1];
				}
				i--;
				System.out.println("-----------"+st+"님의 데이터 삭제 완료----------\n");
				return;
			}
		}
	}
	
}
