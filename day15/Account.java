package com.day15;

public class Account {

	private String accid;
	private int balance;
	public Account(String accid, int balance) {
		this.accid = accid;
		this.balance = balance;
	}
		
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) {
		balance -= money;
	}
	
	public void showInfo() {
		System.out.println("계좌번호 : " + accid);
		System.out.println("잔액 : " + balance + "\n");
	}
}
