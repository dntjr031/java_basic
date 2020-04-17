package com.day6;

import java.io.IOException;

public class SwitchTraining {

	public static void main(String[] args) throws IOException {
		
		System.out.println("주민번호 뒷자리 첫번째 숫자를 입력하시오<1,2,3,4>");
		int num = System.in.read();
		
		char gender = (char)num;
		
		String result = "";
		switch(gender) {
			case '1': case '3':
				result = "남자";
				break;
			case '2': case '4':
				result = "여자";
				break;
			default:
				result = "잘못입력!";
			
		}
		System.out.println(result);

	}

}
