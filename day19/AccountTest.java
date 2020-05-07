package com.day19;

import java.util.Scanner;

public class AccountTest {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Account ac = null;
		
		System.out.println("개설할 계좌종류 - 일반계좌(A), 신용계좌(F), 기부계좌(C)와");
		System.out.println("계좌번호, 잔액을 입력하세요");
		String str = sc.nextLine();
		String accNo = sc.nextLine();
		double balance = sc.nextDouble();
		if(str.equalsIgnoreCase("a")) {
			ac = new Account(accNo, balance);
		}else if(str.equalsIgnoreCase("f")) {
			ac = new FaithAccount(accNo, balance);
		}else if(str.equalsIgnoreCase("c")) {
			ac = new ContriAccount(accNo, balance);
		}else {
			System.out.println("잘못입력");
			return;
		}
		ac.display();
		
		while(true){
			System.out.println("입금할 금액을 입력하세요(종료시 0)");
			double money = sc.nextDouble();
			if(money == 0) {
				System.out.println("종료하였습니다");
				break;
			}
			ac.deposit(money);
			
			ac.display();
		}
	}

}
