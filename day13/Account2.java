package com.day13;

public class Account2 {
	
	String accId, name;
	int balance;
	
	//2. 생성자
	//=> 객체를 생성하면 자동으로 호출되어 가장 먼저 실행되는 메서드
	//=> 멤버변수 초기화를 목적으로 사용되는 메서드
	//클래스명과 동일하고, 매개변수는 있을 수 있으나 반환타입은 없다
	
	//기본 생성자 - 매개변수가 없는 생성자
	//별도로 생성자를 만들지 않으면 컴파일러가 기본생성자를 자동으로 만들어줌
	//하지만 생성자를 하나라도 만들면 컴파일러는 더 이상 기본 생성자를 만들지 않음
	public Account2() {
		
	}
	
	public Account2(String p_accid, String p_name, int p_balance){
		accId = p_accid;
		name = p_name;
		balance = p_balance;
		
	}
	
	public void withdraw(int money) {
		balance -= money;
	}
	
	//입금하는 기능의 메서드
	public void deposit(int money) {
		balance += money;
	}
	
	//편의상 추가된 메서드 - 출력기능
	public void showInfo() {
		System.out.println("계좌번호 : " + accId);
		System.out.println("이름 : " + name);
		System.out.println("잔액 : " + balance + "\n");
		
	}

}
