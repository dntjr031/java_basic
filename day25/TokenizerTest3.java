package com.day25;

import java.util.StringTokenizer;

public class TokenizerTest3 {

	public static void main(String[] args) {
		/*
		 split()은 빈 문자열도 토큰으로 인식하는 반면
		 StringTokenizer는 빈 문자열을 토큰으로 인식하지 않기 때문에
		 인식하는 토큰의 개수가 서로 다름
		 */
		System.out.println("====split이용====");
		String str = "100,,,200,300,400";
		String[] s = str.split(",");
		System.out.println("개수 : " + s.length);
		for(String st : s) {
			System.out.print(st +"|");
		}
		
		System.out.println("\n====token이용====");
		StringTokenizer stt = new StringTokenizer(str, ",");
		
		int count = 0;
		while(stt.hasMoreTokens()) {
			System.out.print(stt.nextToken() + "|");
			count++;
		}
		System.out.println("\n개수 : " + count);
	}

}
