package com.day17;

import java.util.Scanner;

public class AccountTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입금할 금액을 입력하세요");
		int money = sc.nextInt();
		int interest = Account2.carcRate(money);
		
		System.out.println("=======================");
		System.out.println("원금 : " + money + "원, 이자율 : " + 
						Account2.INTEREST_RATE + ", 이자 : " + interest + "원");

		sc.close();
	}

}

class Account2{
	public static final double INTEREST_RATE = 0.02;
	
	public static int carcRate(int a) {
		return (int)(a*INTEREST_RATE);
	}
}