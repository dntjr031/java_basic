package com.day19;

class Account { 
	protected String accNo; 
	protected double balance;
	
	public Account(String accNo, double balance) { 
		this.accNo = accNo; 
		this.balance = balance; 
	}
	
	public void deposit(double money){ 
		balance += money; 
	} 
	
	public void withdraw(double money) { 
		balance -= money; 
	} 
	
	public void display() { 
		System.out.println("계좌번호:"+accNo);
		System.out.println("계좌잔액:"+(int)balance); 
	}
}

class FaithAccount extends Account{
	
	public FaithAccount(String accNo, double balance) {
		super(accNo, (balance + balance*0.01));	
	}

	public void deposit(double money) {
		super.deposit(money + money*0.01);
	}

}

class ContriAccount extends Account{
	private double contribution;
	
	public ContriAccount(String accNo, double balance) {
		super(accNo, (balance - balance*0.01));
	}

	public void deposit(double money) {
		super.deposit(money - money * 0.01);
		contribution += money * 0.01;
	}

	public void display() {
		super.display();
		System.out.println("기부금액:" + (int)contribution);
	}
	
	
}
