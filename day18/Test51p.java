package com.day18;

import java.util.Scanner;

public class Test51p {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� - �����(P), �ӽ���(T)�� �Է��ϼ���");
		String str = sc.nextLine();
		if(str.equalsIgnoreCase("P")) {
			System.out.println("�̸�, �⺻�޿�, ���ʽ��� �Է��ϼ���.");
			String name = sc.nextLine();
			int sALARY = sc.nextInt();
			int bonus = sc.nextInt();
			sc.nextLine();
			
			Permanent p = new Permanent(name, sALARY, bonus);
			System.out.println("-----------------------------------");
			System.out.println("�������:�����");
			System.out.println("�̸�:" + p.getName());
			System.out.println("�޿�:" + p.findPay());
			
		}else if(str.equalsIgnoreCase("T")) {
			System.out.println("�̸�, ���ѽð�, �ð���޿��� �Է��ϼ���.");
			String name = sc.nextLine();
			int time = sc.nextInt();
			int pay = sc.nextInt();
			sc.nextLine();
			
			Temporary t = new Temporary(name, time, pay);
			System.out.println("-----------------------------------");
			System.out.println("�������:�ӽ���");
			System.out.println("�̸�:" + t.getName());
			System.out.println("�޿�:" + t.findPay());
		}else {
			System.out.println("�߸��Է��Ͽ����ϴ�.");
		}
		sc.close();
		
	}

}
