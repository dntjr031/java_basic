package com.day9;

public class MathodTest3 {
	//1. �޼��� ����
	//���ڸ� ������ִ� �޼���
	public static double calcInterest(int money) {
		double interest = money * 0.016;
		
		return interest;
	}
	
	public static void main(String[] args) {
		//public char charAt(int index)
		String str = "java";
		char ch = str.charAt(0);
		
		//public static int parseInt(String s)
		String n = "123";
		int a = Integer.parseInt(n);
		
		System.out.println(ch +" "+ a);
		
		//2. �޼��� ȣ��
		//public static double clacInerest(int money)
		double interest = MathodTest3.calcInterest(1000000);
		System.out.println("���� : " + interest);
		
		int m = 100000;
		double d = calcInterest(m);
		System.out.println(m + "�� ���� : " + d);
		
		/*
		 *[1] static �޼��� ȣ��
		 *	    Ŭ������.�޼���();
		 *
		 *	��, ������ Ŭ���� ���� �޼��� ȣ�� �� Ŭ������ ���� ����
		 *	�޼���();
		 *
		 *[2] instance �޼���(static�� ���� ���� �޼���) ȣ��
		 *	   ��������.�޼���(); 
		 */

	}

}
