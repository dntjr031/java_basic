package com.day19;

import java.util.Scanner;

public class AccountTest {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Account ac = null;
		
		System.out.println("������ �������� - �Ϲݰ���(A), �ſ����(F), ��ΰ���(C)��");
		System.out.println("���¹�ȣ, �ܾ��� �Է��ϼ���");
		String str = sc.nextLine();
		String accNo = sc.nextLine();
		double balance = sc.nextDouble();
		if(str.equalsIgnoreCase("a")) {
			ac = new Account(accNo, balance);
		}else if(str.equalsIgnoreCase("f")) {
			ac = new FaithAccount(accNo, balance);
		}else if(str.equalsIgnoreCase("c")) {
			ac = new ContriAccount(accNo, balance);
		}else {
			System.out.println("�߸��Է�");
			return;
		}
		ac.display();
		
		while(true){
			System.out.println("�Ա��� �ݾ��� �Է��ϼ���(����� 0)");
			double money = sc.nextDouble();
			if(money == 0) {
				System.out.println("�����Ͽ����ϴ�");
				break;
			}
			ac.deposit(money);
			
			ac.display();
		}
	}

}
