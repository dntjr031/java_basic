package com.day6;

import java.util.Scanner;

public class SwitchTest5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하세요");
		int day = sc.nextInt();
		
		String result = "";
		
		switch(day) {
		
			case 1:
			case 2:
			case 3:
				result = "1사분기";
				break;
			case 4:
			case 5:
			case 6:
				result = "2사분기";
				break;
			case 7:
			case 8:
			case 9:
				result = "3사분기";
				break;
			case 10:
			case 11:
			case 12:
				result = "4사분기";
				break;
			default:
				result = "잘못 선택했어요";
		}
		
		System.out.println(day + "월은 " + result + "입니다.");
		
		
		sc.close();

	}

}
