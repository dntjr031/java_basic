package com.day25;

public class StringTest {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "java";
		
		if(str1 == str2) {
			System.out.println("str1, str2�� ���� �ν��Ͻ� ����");
		}else {
			System.out.println("str1, str2�� �ٸ� �ν��Ͻ� ����");
		}
		
		if(str2 == str3) {
			System.out.println("str3, str2�� ���� �ν��Ͻ� ����");
		}else {
			System.out.println("str3, str2�� �ٸ� �ν��Ͻ� ����");
		}
		
		String str4 = new String("Hello");
		String str5 = new String("Hello");
		
		if(str4 == str5) {
			System.out.println("str4, str5�� ���� �ν��Ͻ� ����");
		}else {
			System.out.println("str4, str5�� �ٸ� �ν��Ͻ� ����");
		}
		
		if(str1 == str4) {
			System.out.println("str1, str4�� ���� �ν��Ͻ� ����");
		}else {
			System.out.println("str1, str4�� �ٸ� �ν��Ͻ� ����");
		}
	}

}
