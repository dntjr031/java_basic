package com.day15;

public class BankAccountTest {

	public static void main(String[] args) {

		BankAccount ba1 = new BankAccount(100000);
		ba1.calcTotalBalance();
		System.out.println("ù��° ������ ���� : " + ba1.getBalance());
		System.out.println("������ : " + BankAccount.interest);
		System.out.println("���µ��� ������ �հ� : " + BankAccount.getTotalBalance());
		
		BankAccount ba2 = new BankAccount(200000);
		ba2.calcTotalBalance();
		System.out.println("\n�ι�° ������ ���� : " + ba2.getBalance());
		System.out.println("���� �հ� : " + BankAccount.getTotalBalance());

	}

}
