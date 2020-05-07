package com.day25;

public class StringTest2 {

	public static void main(String[] args) {
		String str1 = "Happy";
		String str2 = " and ";
		String str3 = "Smile";
		String str4 = str1.concat(str2).concat(str3); // String str4 = str1 + str2 + str3
		// public String concat(String str)
		//총 3개의 문자열을 하나로 묶어줌 이를 위해서 추가로 생성된 인스턴스의 수가 2개
		/*
		 StringBuilder sb = new StringBuilder(str1);
		 sb.append(str2).append(str3);
		 String s = sb.toString();
		 */
		System.out.println(str4);
		
		//public int compareTo(String anotherString)
		//=> this.charAt(k) - anotherString.charAt(k);
		if(str1.compareTo(str3) < 0) {
			System.out.println("str1이 앞선다"); //str1이 더 작다
		}else {
			System.out.println("str3이 앞선다");
		}
	}

}
