package com.day22;

import java.io.IOException;

public class ThrowsTest3 {

	public static void main(String[] args) {
		// public abstract int read() throws IOException
		
		System.out.println("남(M), 여(F) 선택!");
		try {
			char ch = (char)System.in.read();
			String str = "";
			switch(Character.toUpperCase(ch)){
				case 'M': str = "남자시군요"; break;
				case 'F': str = "여자시군요"; break;
				default: str = "잘못 입력!";
			}
			System.out.println(str);
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
