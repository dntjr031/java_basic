package com.day9;

import java.util.Scanner;

public class MathodExam4 {
	
	public static String leapYear(int a) {
		String result = "";
		if(a % 400 == 0 || (a % 4 == 0 && a % 100 != 100)) {
			result = "����";
		}else {
			result = "���";
		}
		return result;
	}
	
	public static String oddEven(int i) {
		String str = "";
		if(i % 2 == 0) {
			str = "¦��";
		}else {
			str = "Ȧ��";
		}
		return str;
	}
	
	public static String gender(String s) {
		char ch = s.charAt(0);
		
		String gender = "";
		if(ch == '1' || ch == '3') {
			gender = "����";
		}else if(ch == '2' || ch == '4') {
			gender = "����";
		}else {
			gender = "�߸��Է�";
		}
		return gender;
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("[1]\n�⵵�� �Է��ϼ���");
		int year = sc.nextInt();
		
		String str = leapYear(year);
		System.out.println(year + "�� " + str);
		
		System.out.println("[2]\n������ �Է��ϼ���");
		int a = sc.nextInt();
		
		String result = oddEven(a);
		System.out.println(a + "��" + result);
		
		System.out.println("[3]\n�ֹι�ȣ ���ڸ��� �Է��ϼ���");
		sc.nextLine();
		String b = sc.nextLine();
		
		result = gender(b);
		System.out.println(result);
		
		sc.close();

	}

}
