package com.day25;

public class StringTest {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "java";
		
		if(str1 == str2) {
			System.out.println("str1, str2는 동일 인스턴스 참조");
		}else {
			System.out.println("str1, str2는 다른 인스턴스 참조");
		}
		
		if(str2 == str3) {
			System.out.println("str3, str2는 동일 인스턴스 참조");
		}else {
			System.out.println("str3, str2는 다른 인스턴스 참조");
		}
		
		String str4 = new String("Hello");
		String str5 = new String("Hello");
		
		if(str4 == str5) {
			System.out.println("str4, str5는 동일 인스턴스 참조");
		}else {
			System.out.println("str4, str5는 다른 인스턴스 참조");
		}
		
		if(str1 == str4) {
			System.out.println("str1, str4는 동일 인스턴스 참조");
		}else {
			System.out.println("str1, str4는 다른 인스턴스 참조");
		}
	}

}
