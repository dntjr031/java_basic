package com.day9;

import java.util.Scanner;

public class MathodExam4 {
	
	public static String leapYear(int a) {
		String result = "";
		if(a % 400 == 0 || (a % 4 == 0 && a % 100 != 100)) {
			result = "윤년";
		}else {
			result = "평년";
		}
		return result;
	}
	
	public static String oddEven(int i) {
		String str = "";
		if(i % 2 == 0) {
			str = "짝수";
		}else {
			str = "홀수";
		}
		return str;
	}
	
	public static String gender(String s) {
		char ch = s.charAt(0);
		
		String gender = "";
		if(ch == '1' || ch == '3') {
			gender = "남자";
		}else if(ch == '2' || ch == '4') {
			gender = "여자";
		}else {
			gender = "잘못입력";
		}
		return gender;
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("[1]\n년도를 입력하세요");
		int year = sc.nextInt();
		
		String str = leapYear(year);
		System.out.println(year + "은 " + str);
		
		System.out.println("[2]\n정수를 입력하세요");
		int a = sc.nextInt();
		
		String result = oddEven(a);
		System.out.println(a + "은" + result);
		
		System.out.println("[3]\n주민번호 뒷자리를 입력하세요");
		sc.nextLine();
		String b = sc.nextLine();
		
		result = gender(b);
		System.out.println(result);
		
		sc.close();

	}

}
