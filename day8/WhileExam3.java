package com.day8;

import java.util.Scanner;

public class WhileExam3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է��ϼ���");
		String str = sc.nextLine();
		
		String result = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) <= '9' && str.charAt(i) >= '0') {
				result = "�����Դϴ�.";
			}else {
				result = "���ڰ� �ƴմϴ�.";
				break;
			}
		}
		System.out.println(str + "�� " +result);
		
		System.out.println("===========================");
		
		char ch = ' ';
		boolean isNumber = true;
		
		for(int i = 0 ; i < str.length(); i++) {
			ch = str.charAt(i);
			if(!(ch >= '0' && ch <= '9')) {
				isNumber = false;
				break;
			}
		}
		
		if(isNumber) {
			System.out.println(str + "�� �����Դϴ�.");
		}else {
			System.out.println(str + "�� ���ڰ� �ƴմϴ�.");
		}
		sc.close();
	}

}
