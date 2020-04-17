package com.day8;

import java.util.Scanner;

public class WhileExam3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("값을 입력하세요");
		String str = sc.nextLine();
		
		String result = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) <= '9' && str.charAt(i) >= '0') {
				result = "숫자입니다.";
			}else {
				result = "숫자가 아닙니다.";
				break;
			}
		}
		System.out.println(str + "은 " +result);
		
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
			System.out.println(str + "는 숫자입니다.");
		}else {
			System.out.println(str + "는 숫자가 아닙니다.");
		}
		sc.close();
	}

}
