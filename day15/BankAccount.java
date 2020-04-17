package com.day15;

public class BankAccount {
	//�������
	//[1] �ν��Ͻ� ����
	private int balance;
	//[2] static ����
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
		//static������ this ��� �Ұ�
		BankAccount.totalBalance = totalBalance;
	}
	
	//������
	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	//�޼���
	public void calcTotalBalance() {
		totalBalance += balance;
	}
	
}
