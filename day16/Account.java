package com.day16;

public class Account {
	protected String accNum;
	protected int balance;
	
	public String getAccNum() {
		return accNum;
	}
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}

class KBAccount extends Account{
	private int transferLimit;

	public int getTransferLimit() {
		return transferLimit;
	}

	public void setTransferLimit(int transferLimit) {
		this.transferLimit = transferLimit;
	}
	
	public void printInfo() {
		System.out.println("���¹�ȣ:" + accNum);
		System.out.println("�����ܾ�:" + balance);
		System.out.println("��ü�ѵ�:" + transferLimit);
	}
}
