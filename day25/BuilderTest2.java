package com.day25;

public class BuilderTest2 {

	public static void main(String[] args) {
		//1. String�� StringBuilder��
		String str = "java";
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);
		
		//2. StringBuilder�� String����
		StringBuilder sb2 = new StringBuilder("test");
		String str2 = sb2.toString();
		System.out.println(str2);
	}

}
