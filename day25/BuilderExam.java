package com.day25;

public class BuilderExam {

	public static void main(String[] args) {
		//[1]
		String str = "ABCDEFG";
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println(sb);
		
		//[2]
		String str2 = "990107-1112222";
		StringBuilder sb2 = new StringBuilder(str2);
		System.out.println("\n������ " + sb2);
		sb2.deleteCharAt(str2.indexOf("-"));
		System.out.println("������ "+ sb2 + "\n");
		
		sb2 = new StringBuilder(str2);
		System.out.println("������ " + sb2);
		for (int i = 0; i < sb2.length(); i++) {
			if(sb2.charAt(i) == '-') {
				sb2.deleteCharAt(i);
				break;
			}
		}
		System.out.println("������ " + sb2);
	}

}
