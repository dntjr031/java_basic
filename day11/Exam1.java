package com.day11;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ���ڿ��� �Է��ϼ���");
		String str = sc.nextLine();
		
		int length = str.length();
		char[] a = new char[length];
		
		for(int i = 0; i < str.length(); i++) {
			a[i] = str.charAt(i);
		}
		
		for(int i = 0; i < str.length(); i++) {
			System.out.println("str.charAt<" + i + ">:" + a[i] + "=>" + (int)a[i]);
		}
		
		sc.close();

	}

}
