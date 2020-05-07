package com.day15;

public class BankAccount {
	//멤버변수
	//[1] 인스턴스 변수
	private int balance;
	//[2] static 변수
	public static final double interest = 1.7;
	private static int totalBalance;
	
	//getter/setter
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public static int getTotalBalance() {
		return totalBalance;
	}
	public static void setTotalBalance(int totalBalance) {
		//static에서는 this 사용 불가
		BankAccount.totalBalance = totalBalance;
	}
	
	//생성자
	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	//메서드
	public void calcTotalBalance() {
		totalBalance += balance;
	}
	
}
