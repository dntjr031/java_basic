package com.day6;

import java.io.IOException;

public class Assignment2 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("0~9나 알파벳, 그외 문자를 입력하세요");
		int a = System.in.read();
		
		String result = "";
		if(a >= 48 && a <= 57) {
			result = "숫자입니다.";
		}else if((a >= 65 && a <= 90) || (a >= 97 && a <= 122)) {
			result = "알파벳 문자입니다.";
		}else {
			result = "기타 문자입니다.";
		}
		System.out.println(result);
		
		System.out.println("===================");
		
		char b = (char)a;
		
		if(Character.isDigit(b)) {
			result = "숫자입니다.";
		}else if(Character.isLetter(b)) {
			result = "알파벳 문자입니다.";
		}else {
			result = "기타 문자입니다.";
		}
		System.out.println("메서드활용 => " + result);
		
	}

}
