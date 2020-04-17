package com.day12;

public class Exam4 {

	public static void main(String[] args) {
		
		char[] abcCode = 
					{'`','~','!','@','#','$','%','^','&',
					'*','(',')','-','_','+','=','|','[',
					']','{','}',';',':',',','.','/'	};
		
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		
		String src = "abc123";
		String result = "";
		
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			
			if(!(ch >= '0' && ch <= '9')){
				int idx = ch - 'a';
				result += abcCode[idx];
			}else {
				int idx = ch - '0';
				result += numCode[idx];
			}
		}
		System.out.println("src:" + src);
		System.out.println("result:" + result);

	}

}
