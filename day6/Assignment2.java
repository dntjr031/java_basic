package com.day6;

import java.io.IOException;

public class Assignment2 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("0~9�� ���ĺ�, �׿� ���ڸ� �Է��ϼ���");
		int a = System.in.read();
		
		String result = "";
		if(a >= 48 && a <= 57) {
			result = "�����Դϴ�.";
		}else if((a >= 65 && a <= 90) || (a >= 97 && a <= 122)) {
			result = "���ĺ� �����Դϴ�.";
		}else {
			result = "��Ÿ �����Դϴ�.";
		}
		System.out.println(result);
		
		System.out.println("===================");
		
		char b = (char)a;
		
		if(Character.isDigit(b)) {
			result = "�����Դϴ�.";
		}else if(Character.isLetter(b)) {
			result = "���ĺ� �����Դϴ�.";
		}else {
			result = "��Ÿ �����Դϴ�.";
		}
		System.out.println("�޼���Ȱ�� => " + result);
		
	}

}
