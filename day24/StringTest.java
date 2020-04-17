package com.day24;

public class StringTest {

	public static void main(String[] args) {
		// 01234567890123456789
		String str = "Hello java, Hi java!";

		char c = str.charAt(4);
		System.out.println("index가 4에 해당하는 문자 => " + c); // 'o'

		// indexOf : 특정 문자열의 위치를 구할 때 사용
		// 해당 문자열이 존재하지 않으면 -1을 리턴
		int i = str.indexOf("java");
		System.out.println("java의 위치 : " + i); // 6

		i = str.lastIndexOf("java");
		System.out.println("뒤에서 찾은java의 위치" + i); // 15

		// substring(begin, end) : 특정 문자열을 추출할 때 사용
		// begin <= x < end 사이의 문자열 추출
		String s = str.substring(6, 10);
		System.out.println("6 <= x < 10 사이의 문자열 : " + s); // java

		s = str.substring(12);
		System.out.println("12 부터 끝까지의 문자열 : " + s); // Hi java!

		String url = "www.naver.com";
		if (url.startsWith("www")) {
			System.out.println("url이 www로 시작됨"); //
		} else {
			System.out.println("url이 www로 시작안됨");
		}

		if (url.endsWith("com")) {
			System.out.println("url이 com으로 끝남"); //
		}else {
			System.out.println("url이 com으로 끝나지 않음");
		}
		
		//				0123456789012
		String email = "hong@nate.com";
		if(email.indexOf("@") != -1 && email.indexOf(".") != -1){
			System.out.println("이메일 규칙에 맞습니다.");
		}else {
			System.out.println("이메일 규칙에 맞지 않습니다.");
		}
				
		System.out.println();
		
		String em1 = email.substring(0,4); // hong
		String em2 = email.substring(5,9); // nate
		String em3 = email.substring(10); // com
		
		//*******
		int at = email.indexOf("@");
		int dot = email.indexOf(".");
		em1 = email.substring(0,at);
		em2 = email.substring(at+1,dot);
		em3 = email.substring(dot+1);
		
		System.out.println("@전 => " + em1);
		System.out.println("@~. => " + em2);
		System.out.println(". 이후 => " + em3);
		
		String s2 = "  java, python!  ";
		System.out.println("[" + s2 + "]");
		System.out.println("문자열 길이 : " + s2.length());
		
		String s3 = s2.trim();
		System.out.println("trim 후 [" + s3 + "]");
		System.out.println("trim 후 길이 : " + s3.length());
		
		int n = 10;
		
		String s4 = Integer.toString(n);
		System.out.println("int를 문자열로 변환 - toString():" + s4);
		s4 = String.valueOf(n);
		System.out.println("int를 문자열로 변환 - valueOf():" + s4);
		
	}

}
