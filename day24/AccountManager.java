package com.day24;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountManager {
	static Scanner sc = new Scanner(System.in);
	ArrayList<Account> arr = new ArrayList<Account>();
	
	public int input() {
		System.out.println("-----Menu-----");
		System.out.println("1. 계좌개설");
		System.out.println("2. 입      금");
		System.out.println("3. 출      금");
		System.out.println("4. 전체출력");
		System.out.println("5. 종      료");
		System.out.print("선택 : ");
		int n = sc.nextInt();
		sc.nextLine();
		return n;
		
	}
	
	public void accountInput() {
		System.out.println("\n[계좌종류선택]");
		System.out.println("1. 보통예금계좌");
		System.out.println("2. 신용신뢰계좌");
		System.out.print("선택: ");
		int n = sc.nextInt();
		sc.nextLine();
		if(n == 1) {
			arr.add(NormalAccountInput());
		}else if(n == 2) {
			arr.add(HighCreditAccountInput());
		}else {
			System.out.println("잘못입력\n");
			return;
		}
		System.out.println("개설 완료!\n");
	}
	
	private Account NormalAccountInput() {
		System.out.println("\n[보통예금계좌 개설]");
		System.out.print("계좌ID: ");
		String accId = sc.nextLine();
		System.out.print("이름: ");
		String accName = sc.nextLine();
		System.out.print("입금액: ");
		int balance = sc.nextInt();
		sc.nextLine();
		System.out.print("이자율: ");
		int iNTERAST_RATE = sc.nextInt();
		sc.nextLine();
		
		Account acc = new NormalAccount(accId, accName, balance, iNTERAST_RATE);
		return acc;
	}
	
	private Account HighCreditAccountInput() {
		System.out.println("\n[보통예금계좌 개설]");
		System.out.print("계좌ID: ");
		String accId = sc.nextLine();
		System.out.print("이름: ");
		String accName = sc.nextLine();
		System.out.print("입금액: ");
		int balance = sc.nextInt();
		sc.nextLine();
		System.out.print("이자율: ");
		int iNTERAST_RATE = sc.nextInt();
		sc.nextLine();
		System.out.print("\n신용등급(A, B, C): ");
		String grade = sc.nextLine();
		
		Account acc = new HighCreditAccount(accId, accName, balance, iNTERAST_RATE, grade);
		return acc;
	}
	
	public void totalInfo() {
		if(arr.isEmpty()) {
			System.out.println("개설된 계좌가 없습니다.\n");
			return;
		}
		System.out.println("\n======전체 고객 계좌======");
		for (int i = 0; i < arr.size(); i++) {
			arr.get(i).showInfo();
			System.out.println();
		}
		System.out.println("======================");
	}
	
	public void arrIn() {
		if(arr.isEmpty()) {
			System.out.println("개설된 계좌가 없습니다.\n");
			return;
		}
		System.out.println("\n[입      금]");
		System.out.print("계좌ID: ");
		String accId = sc.nextLine();
		System.out.print("입금액: ");
		int money = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < arr.size(); i++) {
			if((arr.get(i).getAccId()).equals(accId)) {
				arr.get(i).accIn(money);
				System.out.println("입금완료\n");
				return;
			}
		}
		System.out.println("유효하지 않은 ID입니다.\n");
	}
	
	public void arrout() {
		if(arr.isEmpty()) {
			System.out.println("개설된 계좌가 없습니다.\n");
			return;
		}
		System.out.println("\n[출      금]");
		System.out.print("계좌ID: ");
		String accId = sc.nextLine();
		System.out.print("출금액: ");
		int money = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < arr.size(); i++) {
			if((arr.get(i).getAccId()).equals(accId)) {
				int n = arr.get(i).accOut(money);
				if(n == 0) {
					System.out.println("잔액부족\n");
				}else {
					System.out.println("출금완료\n");
				}
				return;
			}
		}
		System.out.println("유효하지 않은 ID입니다.\n");
	}
}
