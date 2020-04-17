package com.day25;

public class BuilderTest2 {

	public static void main(String[] args) {
		//1. String을 StringBuilder로
		String str = "java";
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);
		
		//2. StringBuilder를 String으로
		StringBuilder sb2 = new StringBuilder("test");
		String str2 = sb2.toString();
		System.out.println(str2);
	}

}
