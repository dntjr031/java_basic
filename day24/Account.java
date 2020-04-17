package com.day24;

public class Account {
	protected String accId, accName;
	protected int balance;
	
	public Account(String accId, String accName, int balance) {
		this.accId = accId;
		this.accName = accName;
		this.balance = balance;
	}
	public String getAccId() {
		return accId;
	}
	public void setAccId(String accId) {
		this.accId = accId;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void accIn(int money) {
		balance += money;
	}
	
	public int accOut(int money) {
		if(balance < money) {
			return 0;
		}
		balance -= money;
		return 1;
	}
	
	public void showInfo() {
		System.out.println("계좌ID: " + accId);
		System.out.println("이    름: " + accName);
		System.out.println("잔    액: " + balance);
	}
}

class NormalAccount extends Account{
	protected final int INTERAST_RATE;

	public NormalAccount(String accId, String accName, int balance, int iNTERAST_RATE) {
		super(accId, accName, balance);
		INTERAST_RATE = iNTERAST_RATE;
	}

	public void accIn(int money) {
		super.accIn(money + money*INTERAST_RATE/100);
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("이자율: " + INTERAST_RATE + "%");
	}
	
}

class HighCreditAccount extends NormalAccount implements HighCredit{
	private final int HIGH_INTERAST_RATE;

	public HighCreditAccount(String accId, String accName, int balance, int iNTERAST_RATE, String grade) {
		super(accId, accName, balance, iNTERAST_RATE);
		if(grade.equalsIgnoreCase("a")) {
			HIGH_INTERAST_RATE = A;
		}else if(grade.equalsIgnoreCase("b")) {
			HIGH_INTERAST_RATE = B;
		}else if(grade.equalsIgnoreCase("c")) {
			HIGH_INTERAST_RATE = C;
		}else {
			HIGH_INTERAST_RATE = 0;
		}
	}

	public void accIn(int money) {
		balance += money + money*INTERAST_RATE/100 + money*HIGH_INTERAST_RATE/100;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("특별이자율: " + HIGH_INTERAST_RATE + "%");
	}
	
}

interface HighCredit{
	int A = 3, B = 2, C = 1;
}