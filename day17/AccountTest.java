package com.day17;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("계좌번호, 잔액, 이체한도를 입력하세요");
		String accId = sc.nextLine();
		int balance = sc.nextInt();
		int limit = sc.nextInt();
		sc.nextLine();
		
		System.out.println("=================================");
		KBAccount kb = new KBAccount(accId, balance, limit);
		kb.display();
		
		sc.close();

	}

}

class Account{
	protected String accId;
	protected int balance;
	
	public Account(String accId, int balance) {
		this.accId = accId;
		this.balance = balance;
	}
	public String getAccId() {
		return accId;
	}
	public void setAccId(String accId) {
		this.accId = accId;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void display() {
		System.out.println("계좌번호 : " + accId);
		System.out.println("잔액 : " + balance);
	}
}

class KBAccount extends Account{
	private int limit;

	public KBAccount(String accId, int balance, int limit) {
		super(accId, balance);
		this.limit = limit;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public void display() {
		
		super.display();
		System.out.println("이체한도 : " + limit);
	}
	
	
}
