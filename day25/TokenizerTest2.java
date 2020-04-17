package com.day25;

import java.util.StringTokenizer;

public class TokenizerTest2 {

	public static void main(String[] args) {
		String str = "1,홍길동,100,95,88|2,김길동,85,77,66|3,이길동,91,79,99";
		
		StringTokenizer st = new StringTokenizer(str, "|");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			
			StringTokenizer st2 = new StringTokenizer(token,",");
			while(st2.hasMoreTokens()) {
				System.out.println(st2.nextToken());
			}
			System.out.println("=========");
			
		}
		
		/*
		 문자열에 포함된 데이터가 두 가지 종류의 구분자로 나뉘어져 있을 때
		 두 개의 StringTokedizer와 이중 반복문을 사용해서 처리
		 
		 한 학생의 정보를 구분하기 위해 "|"를 사용
		 학생의 이름과 점수 등을 구분하기 위해 ","fmf tkdyd
		 */
		
		//split()이용
		System.out.println("\n====split() 이용====");
		
		String[] s = str.split("\\|");
		for (int i = 0; i < s.length; i++) {
			String[] sarr = s[i].split(",");
			
			for (int j = 0; j < sarr.length; j++) {
				System.out.println(sarr[j]);
			}
			System.out.println("----------");
		}
	}

}
